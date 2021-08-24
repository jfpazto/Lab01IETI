package com.escuelaing.edu.co.Lab01.service;

import com.escuelaing.edu.co.Lab01.data.User;

import java.util.List;

public interface UserService {
    User create( User user );

    User findById( String id );

    List<User> all();

    void deleteById( String id );

    User update( User user, String userId );
}
