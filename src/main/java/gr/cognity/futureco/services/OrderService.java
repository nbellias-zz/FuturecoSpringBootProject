/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.futureco.services;

import gr.cognity.futureco.repositories.OrderRepository;
import java.util.List;
import java.util.Optional;
import models.Order;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nmpellias
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    
    public Optional<Order> get(ObjectId cust_id){
        return orderRepository.findById(cust_id);
    }
    
}



