package io.github.coorus.section1_15.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User add(User user) {
        System.out.println("添加用户" + user);
        return user;
    }

    public void add(int user) {
        System.out.println("添加用户" + user);
    }

    public void remove(Integer id) {
        System.out.println("删除用户" + id);
    }

    public void edit(User user) {
        System.out.println("编辑用户" + user);
    }

    public User get(Integer id) {
        return new User(1, "张三");
    }
}