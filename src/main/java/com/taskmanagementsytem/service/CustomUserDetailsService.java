package com.taskmanagementsytem.service;

import com.taskmanagementsytem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails;

        userDetails=userRepo.findByUsername(username);

        Set<GrantedAuthority>  grantedAuthorities=new HashSet<>();

        userDetails.getAuthorities().forEach(role->{
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        });


        return new User(userDetails.getUsername(), userDetails.getPassword(),grantedAuthorities);


    }
}

