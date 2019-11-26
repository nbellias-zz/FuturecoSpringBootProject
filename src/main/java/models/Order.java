/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author nmpellias
 */
@Document(collection = "orders")
public class Order {
    @Id
    private ObjectId _id;
    private String cust_id;
    private Date ord_date;
    private String status;
    private Double amount;

    public Order() {
    }

    public Order(ObjectId _id, String cust_id, Date ord_date, String status, Double amount) {
        this._id = _id;
        this.cust_id = cust_id;
        this.ord_date = ord_date;
        this.status = status;
        this.amount = amount;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public Date getOrd_date() {
        return ord_date;
    }

    public void setOrd_date(Date ord_date) {
        this.ord_date = ord_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" + "_id=" + _id + ", cust_id=" + cust_id + ", ord_date=" + ord_date + ", status=" + status + ", amount=" + amount + '}';
    }
    
}


