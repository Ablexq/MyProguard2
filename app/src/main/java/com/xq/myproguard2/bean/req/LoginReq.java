package com.xq.myproguard2.bean.req;

import com.xq.myproguard2.bean.CommonBean;

public class LoginReq extends CommonBean {

    private String phoneNum;
    private String password;

    public LoginReq(String phoneNum, String password) {
        this.phoneNum = phoneNum;
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginReq{" +
                "phoneNum='" + phoneNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
