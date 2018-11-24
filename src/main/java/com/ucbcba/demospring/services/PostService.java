package com.ucbcba.demospring.services;

import com.ucbcba.demospring.entities.Post;

public interface PostService {

    Iterable<Post> listAllPosts();
    Iterable<Post> searchByTitle(String query);

    Post findPost(Integer id);
    void savePost(Post post);

}
