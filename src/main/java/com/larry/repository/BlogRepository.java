package com.larry.repository;

import com.larry.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hangyanjiang on 2017/6/14.
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {



}
