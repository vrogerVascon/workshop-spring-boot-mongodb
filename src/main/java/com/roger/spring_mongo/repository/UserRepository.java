package com.roger.spring_mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.roger.spring_mongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
