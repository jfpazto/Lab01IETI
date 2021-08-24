package com.escuelaing.edu.co.Lab01.controller;

import com.escuelaing.edu.co.Lab01.data.User;
import com.escuelaing.edu.co.Lab01.dto.UserDTO;
import com.escuelaing.edu.co.Lab01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController {
    private final UserService userService;
    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        //TODO implement this method using UserService
        return ResponseEntity.status(HttpStatus.OK).body(userService.all());
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable String id )
    {
        //TODO implement this method using UserService
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody User userDto )
    {
        //TODO implement this method using UserService
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(userDto));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update(@RequestBody User userDto, @PathVariable String id )
    {
        //TODO implement this method using UserService
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(userDto, id));
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete(@PathVariable String id )
    {
        //TODO implement this method using UserService
        try{
            userService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body((true));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.ordinal()).body((false));
        }
    }
}
