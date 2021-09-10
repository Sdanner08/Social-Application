package com.ocean.repository;

import com.ocean.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("likeDao")
@Transactional
public interface LikeDao extends JpaRepository<Like, Integer> {
}
