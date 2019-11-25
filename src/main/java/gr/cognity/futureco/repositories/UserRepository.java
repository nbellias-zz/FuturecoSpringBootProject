/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.futureco.repositories;

import models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nmpellias
 */
public interface UserRepository extends MongoRepository<User, Integer> {
    
}




