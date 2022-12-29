package com.spring.blog.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.blog.model.Post;
import com.spring.blog.repositorio.BlogRepositorio;

@Service
public class CodeblogImplementService implements CodeblogService{

	@Autowired
	private BlogRepositorio repositorio;
	
	@Override
	public List<Post> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Post findById(long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return repositorio.save(post);
	}

}
