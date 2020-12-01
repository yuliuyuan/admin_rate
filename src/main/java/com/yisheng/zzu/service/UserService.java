package com.yisheng.zzu.service;

import com.yisheng.zzu.mapper.UserMapper;
import com.yisheng.zzu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll(){
        List<User>  list = userMapper.selectList(null);
        return  list;
    }
}
