package com.escuelaing.edu.co.Lab01.service;

import com.escuelaing.edu.co.Lab01.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final HashMap<String, User> hashUser = new HashMap();
    @Override
    public User create(User user) {
        hashUser.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        User user=hashUser.get(id);
        return user;
    }

    @Override
    public List<User> all() {
        return new ArrayList<User>(hashUser.values());
    }

    @Override
    public void deleteById(String id) {
        hashUser.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        hashUser.put(userId,user);
        return user;
    }
}
