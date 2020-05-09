package com.selfprojects.SpringBlogger.Controller;

import com.selfprojects.SpringBlogger.RequestsObjects.LoginRequest;
import com.selfprojects.SpringBlogger.RequestsObjects.RegisterationInput;
import com.selfprojects.SpringBlogger.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterationInput request){
        try {
            authService.authenticate(request);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity()
        }

    }

    @PostMapping("/signin")
    public ResponseEntity signin(@RequestBody LoginRequest request){

    }


}
