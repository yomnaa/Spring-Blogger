package com.selfprojects.SpringBlogger.Service;

import com.selfprojects.SpringBlogger.Model.User;
import com.selfprojects.SpringBlogger.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User>user=userRepository.findByUserName(s);
        if(user.isPresent()){
            return new ImplementedUserDetails(user.get());
        }
        throw new UsernameNotFoundException(String.format("User with name %s not found",s));

    }
}
