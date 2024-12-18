package com.example.controller;


import com.example.entity.Post;
import com.example.repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    
    @PostMapping("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savePost = postRepository.save(post);
        return  new ResponseEntity<>(savePost, HttpStatus.CREATED);
    }
}
