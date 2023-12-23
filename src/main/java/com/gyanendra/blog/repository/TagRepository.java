package com.gyanendra.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyanendra.blog.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{
    /**
     * SQL query: SELECT * FROM users WHERE id = ?
     *
     * @param id as Long
     * @return Post
     */

    Tag getTagByTagId(Long id);
}
