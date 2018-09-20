package com.ucbcba.demospring.controllers;

import com.ucbcba.demospring.entities.Post;
import com.ucbcba.demospring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PostController {

    PostService postService;


    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String index( Model model) {
        List<Post> posts  = (List) postService.listAllPosts();
        model.addAttribute("posts", posts);
        return "posts";
    }
}
