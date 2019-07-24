package com.minimoviles.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.minimoviles.entidades.BerryCmsContent;
import com.minimoviles.service.PostService;

@RestController
@RequestMapping(path = "/articulos")
public class PostRest {
	
	@Autowired
	private PostService postService;
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody Iterable<BerryCmsContent> getAllPost() {
		return postService.getAllPost();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
 	public @ResponseBody Optional<BerryCmsContent> getPost(@PathVariable("id") String id) {
		
		return postService.getPost(id);
	}


}