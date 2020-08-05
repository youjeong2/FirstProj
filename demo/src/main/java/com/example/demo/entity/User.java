package com.example.demo.entity;

public class User {
    private int signupNo;
    private String id;
    private String pw;
    private String adress;
    private String tel;
    private String gender;


    public int getSignupNo() {
        return signupNo;
    }
    public void setSignupNo(int signupNo) {
        this.signupNo = signupNo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
