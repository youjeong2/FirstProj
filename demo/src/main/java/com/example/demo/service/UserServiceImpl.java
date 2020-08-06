package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepo repo;

    @Override
    public void signupInfo(User signup) throws Exception {
        log.info("signupInfo");
        repo.signupInfo(signup);
    }
    @Override
    public Boolean loginInfo(User login) throws Exception {
        log.info("loginInfo");
        return repo.loginInfo(login);


    }
}
