package io.github.coorus.section1_17.service;

import io.github.coorus.section1_17.user.User;

public interface IUserService {
    User add(User user);
    User remove(int id);


}
