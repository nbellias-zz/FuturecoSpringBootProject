/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.futureco.services;

import gr.cognity.futureco.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nmpellias
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public List<User> getAllUsers(){
        return repository.findAll();
    }
    
    public Optional<User> getUser(int id){
        return repository.findById(id);
    }
    
    public User save(User user){
        return repository.save(user);
    }
    
    
}



