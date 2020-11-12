package com.example.controller;

import com.example.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户controller
 *
 * @author: jqq
 * @time: 2020/11/12 10:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 用户登录
     *
     * @param user
     */
    @RequestMapping("/login")
    public ResponseEntity<String> login(User user) {
        System.out.println();
        return ResponseEntity.ok("登录成功！");
    }
}
