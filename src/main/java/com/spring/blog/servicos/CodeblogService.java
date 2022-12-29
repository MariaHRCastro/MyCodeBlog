package com.spring.blog.servicos;

import java.util.List;

import com.spring.blog.model.Post;

public interface CodeblogService {

	List<Post> findAll();
	
	Post findById(long id);
	
	Post save(Post post);
}
