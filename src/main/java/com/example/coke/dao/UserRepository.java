package com.example.coke.dao;
import com.example.coke.enity.user;
import org.springframework.data.repository.CrudRepository;

//此接口用于实现登录注册功能（参考老师代码，具体细节我不是很懂）
public interface UserRepository extends CrudRepository<user, Integer> {
    user findByUsername(String username);
}
