package com.example.coke.enity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Data
public class user implements UserDetails {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int user_id;
    private String username;
    private String password;
    private String user_number;
    private String address;
    private String credit;
    private boolean real_name;
    private String question;
    private String answer;
    private int sold;
    private int buy;
    private String photo;
    private double money;

    public user(
            String username, String password, String user_number,
                String address, String credit, boolean real_name, String question,
                String answer, int sold, int buy, String photo, double money) {
        this.username = username;
        this.password = password;
        this.user_number = user_number;
        this.address = address;
        this.credit = credit;
        this.real_name = real_name;
        this.question = question;
        this.answer = answer;
        this.sold = sold;
        this.buy = buy;
        this.photo = photo;
        this.money = money;
    }

    public user() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
