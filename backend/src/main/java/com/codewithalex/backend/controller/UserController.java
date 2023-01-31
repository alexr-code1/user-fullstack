/*
Map HTTP operations to DB

Inject User Repository
with Autowired Annotation
*/

package com.codewithalex.backend.controller;
import com.codewithalex.backend.model.User;
import com.codewithalex.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/getAll")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }


}
