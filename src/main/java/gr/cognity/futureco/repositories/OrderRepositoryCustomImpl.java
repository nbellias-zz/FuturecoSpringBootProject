/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.futureco.repositories;

import models.Order;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;

/**
 *
 * @author nmpellias
 */
public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Object fetchSumOfStatusADocs() {
        // Object obj = new Object();
        // Query query = new Query();
        // query.addCriteria(Criteria.where("cust_id").is("xyz1"));
        
        System.out.println("fetchSumOfStatusADocs");
        
        Aggregation agg = newAggregation(
                match(Criteria.where("status").is("A")),
                group("_id").sum("amount").as("total"),
                sort(Sort.Direction.DESC, "total")
        );

        //Convert the aggregation result into a List
        AggregationResults<Object> groupResults 
                = mongoTemplate.aggregate(agg, Order.class, Object.class);
        Object result = groupResults.getMappedResults();
        
        System.out.println(result);
        
        return result;
    }

}






