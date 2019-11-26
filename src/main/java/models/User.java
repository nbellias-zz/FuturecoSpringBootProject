/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author nmpellias
 */
@Document(collection = "user")
public class User {
    
    @Id
    private ObjectId _id;
    private Integer id;
    private String name;
    private String userName;
    private String passWord;

    public User() {
    }

    public User(ObjectId _id, Integer id, String name, String userName, String passWord) {
        this._id = _id;
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", userName=" + userName + ", passWord=" + passWord + '}';
    }
    
    
}








