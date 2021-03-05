package com.coll.OnlineCollaborate.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaborate.model.BlogComments;
import com.coll.OnlineCollaborate.service.IBlogCommentsService;

@Service
@Transactional
public class BlogCommentsServiceImpl implements IBlogCommentsService{

	@Override
	public List<BlogComments> getAllBlogsComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogComments> getBlogsCommentsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogComments> getUsersBlogsComments(int blogcommentsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogComments> mainList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogComments getBlogCommentsById(int blogcommentsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBlogComments(BlogComments blogcomments) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBlogComments(BlogComments blogcomments) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBlogComments(BlogComments blogcomments) {
		// TODO Auto-generated method stub
		return false;
	}

}
