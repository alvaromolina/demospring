package com.ucbcba.demospring.repositories;

import com.ucbcba.demospring.entities.Post;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface PostRepository extends CrudRepository<Post,Integer> {
}
