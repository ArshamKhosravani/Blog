package com.bahar.service;

import com.bahar.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexService {


    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        User user=new User();
        user.setId(12);
        user.setName("Bahar");
        user.setlastname("Sarami");
        users.add(user);

        return users;
    }
}
