package com.ocean.repository;


import com.ocean.models.User;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/*
 *    @author
 *      Front End:
 *        -Angel Walker
 *       -Trevor Drury
 *       Back End:
 *        -David Burton
 *        -Shane Danner
 */
@Repository("userDao")
@Transactional
public interface UserDao extends JpaRepository<User, Integer> {
    //Find user by username
    User findUserByUsername(String username);
}

