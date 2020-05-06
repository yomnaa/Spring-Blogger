package com.selfprojects.SpringBlogger.Repositories;

import com.selfprojects.SpringBlogger.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
