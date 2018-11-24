package com.ucbcba.demospring.repositories;

import com.ucbcba.demospring.entities.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface PostRepository extends CrudRepository<Post,Integer> {

    @Query("select p from Post p where p.title like CONCAT('%',:title,'%')")
    public Iterable<Post> searchByTitle(@Param("title") String title);
}
