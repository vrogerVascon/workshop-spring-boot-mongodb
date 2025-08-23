package com.roger.spring_mongo.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.roger.spring_mongo.domain.User;
import com.roger.spring_mongo.services.UserService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/users")
public class UserResurce {

    @Autowired
    private UserService service;

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
