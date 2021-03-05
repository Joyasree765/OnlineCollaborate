package com.coll.OnlineCollaborate.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coll.OnlineCollaborate.model.BlogComments;
import com.coll.OnlineCollaborate.service.IBlogCommentsService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")

public class BlogCommentsController {
	@Autowired
	IBlogCommentsService blogcommentsService;
	
	@PostMapping("save-blogcomments")
	public boolean saveBlogComments(@RequestBody BlogComments blogcomments)
	{
		return blogcommentsService.addBlogComments(blogcomments);
	}
	
	@GetMapping("blogcomments-list")
	public List<BlogComments> allBlogComments()
	{
		return blogcommentsService.getAllBlogsComments();
	}
	
	@DeleteMapping("delete-blogcomments/{blogcomments}")
	public boolean deleteBlogComments(@PathVariable("blogcomments") BlogComments blogcomments)
	{
		return blogcommentsService.deleteBlogComments(blogcomments);
	}
	
	@GetMapping("blogcomments/{blogcomments_id}")
	public BlogComments blogcommentsById(@PathVariable("blogcomments_id") int blogcomments_id)
	{
		return blogcommentsService.getBlogCommentsById(blogcomments_id);
	}
	
	@PostMapping("update-blogcomments/{blogcomments}")
	public boolean updateBlogcomments(@PathVariable("blogcomments") BlogComments blogcomments)
	{
		return blogcommentsService.updateBlogComments(blogcomments);
	}


}
