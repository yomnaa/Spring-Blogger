package com.selfprojects.SpringBlogger.Service;

import com.selfprojects.SpringBlogger.Model.User;
import com.selfprojects.SpringBlogger.Repositories.UserRepository;
import com.selfprojects.SpringBlogger.RequestsObjects.RegisterationInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    public void authenticate(RegisterationInput input) throws Exception {
        Optional<User> existedUser=userRepository.findByUserName(input.getUsername());
        if(existedUser.isPresent()){
            throw new Exception("User with this name already registered");
        }
        User user=new User();
        user.setEmail(input.getEmail());
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        user.setUserName(input.getUsername());
        userRepository.save(user);
    }


}
