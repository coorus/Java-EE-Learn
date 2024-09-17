package io.github.coorus.section1_17.service;


import io.github.coorus.section1_17.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService implements Add, Remove{
    private static final Map<Integer, User> userMap = new HashMap<>();

    @Override
    public User remove(int id) {
        System.out.println("删除User：" + getUserById(id));
        return userMap.remove(id);
    }

    @Override
    public User add(User user) {
        return userMap.put(user.getId(), user);
    }

    private static User getUserById(int id) {
        return userMap.get(id);
    }
}
