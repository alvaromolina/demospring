package com.ucbcba.demospring.services;

import com.ucbcba.demospring.entities.Post;

public interface PostService {

    Iterable<Post> listAllPosts();
    Post findPost(Integer id);
}
