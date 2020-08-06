package com.example.demo.repository;

import com.example.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepo {

    static final Logger log =
            LoggerFactory.getLogger(UserRepo.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void signupInfo(User signup) throws Exception{
        String query = "insert into user(" +
                "signup_no, id, pw, gender, tel, adress) values(?, ?, ?, ?, ?, ?)";

        log.info("signupInfo repo");

        jdbcTemplate.update(query, signup.getSignupNo(), signup.getId(), signup.getPw(),
                            signup.getGender(), signup.getTel(), signup.getAdress());
    }

    public Boolean loginInfo(User login) throws Exception {
        List<User> results = jdbcTemplate.query(
                "select id, pw from user where id = ? and pw = ?",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User login = new User();
                        login.setId(rs.getString("id"));
                        login.setPw(rs.getString("pw"));
                        return login;
                    }
                }, login.getId(), login.getPw());
        return results.isEmpty() ? false : true;
    }
}

