package com.example.coke.enity;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
//用于注册的类
public class RegistrationForm {
    private String username;
    private String password;
    private String userNumber;
    private String address;
    private String credit;
    private boolean realName;
    private String question;
    private String answer;
    private int sold;
    private int buy;
    private String photo;
    private double money;

    public user toUser(PasswordEncoder passwordEncoder) {
        return new user(username, passwordEncoder.encode(password),
                userNumber,address,credit,realName,question,
                answer,sold,buy,photo,money);
    }
}
