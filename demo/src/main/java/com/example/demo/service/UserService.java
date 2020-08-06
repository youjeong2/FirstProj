package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    public void signupInfo(User signup) throws Exception;
    public Boolean loginInfo(User login) throws Exception;
}
