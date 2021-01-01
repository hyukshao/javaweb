package com.example.coke.service;

import com.example.coke.dao.UserRepository;
import com.example.coke.enity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//此Service用于实现登录注册功能（参考老师代码，具体细节我不是很懂）
@Service
public class UserRepositoryUserDetailsService implements UserDetailsService{
    private UserRepository userRepo;
    @Autowired
    public UserRepositoryUserDetailsService(UserRepository userRepo) {
        this.userRepo=userRepo;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user=userRepo.findByUsername(username);
        if(user!=null) {
            return user;
        }
        throw new UsernameNotFoundException("User"+username+"not found");
    }
}