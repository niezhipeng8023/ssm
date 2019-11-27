package com.nzp.service.impl;

import com.nzp.bean.User;
import com.nzp.bean.UserExample;
import com.nzp.mappers.UserMapper;
import com.nzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(String username, String password) {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        for (User user : users) {
            if (password !=null ||password == user.getPassword() ){
                return true;
            }
        }
        return true;

    }

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.selectByExample(null);
        return users;
    }
}
