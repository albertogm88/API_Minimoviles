package com.minimoviles.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minimoviles.entidades.BerryCmsContent;
import com.minimoviles.repositorio.PostRepositorio;

@Service
public class PostService {
	
	@Autowired
	private PostRepositorio postRepositorio;
	
	
	public Iterable<BerryCmsContent> getAllPost(){
		return postRepositorio.findAll();
	}
	
	public Iterable<BerryCmsContent> getPostPaginate(int firstResult, int pageSize){
		return postRepositorio.findAllPaginate(firstResult, pageSize);
	}
	
	public Optional<BerryCmsContent> getPost(String id){
		return postRepositorio.findById(id);
	}

}
