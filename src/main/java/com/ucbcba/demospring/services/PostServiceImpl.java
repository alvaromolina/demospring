package com.ucbcba.demospring.services;

import com.ucbcba.demospring.entities.Post;
import com.ucbcba.demospring.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    PostRepository postRepository;


    @Autowired
    @Qualifier(value = "postRepository")
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }
}
