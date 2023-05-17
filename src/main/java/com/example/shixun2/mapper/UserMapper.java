package com.example.shixun2.mapper;

import com.example.shixun2.bean.Tuser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int login(Tuser tuser);

    int register(Tuser tuser);
}
