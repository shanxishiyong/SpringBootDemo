package com.example.demo1;

import com.example.demo1.entity.User;
import com.example.demo1.service.imp.UserServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

    @Autowired
    private UserServiceImp us;


    @org.junit.Test
    public void adduser(){
        User u = new User();
        u.setId("39abc");
        u.setName("王武");
        u.setAge(15);
        u.setWorkMes("这是测试");
        us.insertUser(u);
    }

}
