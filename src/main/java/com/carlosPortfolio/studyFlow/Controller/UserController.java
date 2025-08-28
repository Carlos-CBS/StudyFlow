package com.carlosPortfolio.studyFlow.Controller;

import com.carlosPortfolio.studyFlow.Model.User;
import com.carlosPortfolio.studyFlow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user) {
            userRepo.save(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user) {
        userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        userRepo.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
