package io.github.coorus.section1_17.service;


import io.github.coorus.section1_17.user.User;

import java.util.HashMap;
import java.util.Map;

public class UserService implements IUserService {
    private final Map<Integer, User> userMap = new HashMap<>();

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    @Override
    public User remove(int id) {
        System.out.println("删除User：" + getUserById(id));
        return userMap.remove(id);
    }

    @Override
    public User add(User user) {
        return userMap.put(user.getId(), user);
    }

    public User getUserById(int id) {
        return userMap.get(id);
    }
}
