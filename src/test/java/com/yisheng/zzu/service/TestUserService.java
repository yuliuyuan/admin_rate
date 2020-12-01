package com.yisheng.zzu.service;

import com.yisheng.zzu.mapper.UserMapper;
import com.yisheng.zzu.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testSelect() {
        List<User> userList = userService.selectAll();
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}