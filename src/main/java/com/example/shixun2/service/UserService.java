package com.example.shixun2.service;

import com.example.shixun2.bean.Tuser;

public interface UserService {
    boolean login(Tuser tuser);

    boolean register(Tuser tuser);
}
