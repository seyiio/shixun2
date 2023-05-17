package com.example.shixun2.service.impl;

import com.example.shixun2.bean.Tuser;
import com.example.shixun2.mapper.UserMapper;
import com.example.shixun2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;
    @Override
    public boolean login(Tuser tuser) {
        int user=usermapper.login(tuser);
        return user > 0;
    }

    @Override
    public boolean register(Tuser tuser) {
        int user=usermapper.register(tuser);
        return user > 0;
    }
}
