package com.ocean.repository;

import com.ocean.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("postDao")
@Transactional
public interface PostDao extends JpaRepository<Post, Integer> {
}
