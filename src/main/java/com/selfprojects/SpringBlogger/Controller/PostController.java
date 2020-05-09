package com.selfprojects.SpringBlogger.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/allposts/{username}")
    public ResponseEntity getUsrPosts(@RequestParam String username){
            return null;
    }

}
