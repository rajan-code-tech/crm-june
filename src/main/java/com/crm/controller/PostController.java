package com.crm.controller;

import com.crm.entity.Post;
import com.crm.service.PostService;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public String createPost(@RequestBody Post post){
        System.out.println(2000);
        System.out.println(3000);
        postService.addPost(post);
        return "Post added";
    }
    @DeleteMapping
    public void deletePost(){
        postService.deletePost();

    }
}
