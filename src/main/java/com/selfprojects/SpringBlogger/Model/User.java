package com.selfprojects.SpringBlogger.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
@Entity
public class User {
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    @Column
    @NotBlank
    private String userName;
    @Column
    private String password;
    @Column
    private String email;

}
