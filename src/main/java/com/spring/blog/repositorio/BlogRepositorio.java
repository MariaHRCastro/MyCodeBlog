package com.spring.blog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.blog.model.Post;

@Repository
public interface BlogRepositorio extends JpaRepository<Post, Long>{

}
