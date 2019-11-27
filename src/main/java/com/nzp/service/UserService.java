package com.nzp.service;

import com.nzp.bean.User;

import java.util.List;

public interface UserService {

    boolean login(String username,String password);

    List<User> findAll();

}
