package com.coll.OnlineCollaborate.service;
import java.util.List;

import com.coll.OnlineCollaborate.model.BlogComments;

public interface IBlogCommentsService {
	List<BlogComments> getAllBlogsComments();
	List<BlogComments> getBlogsCommentsByStatus(String status);
	List<BlogComments> getUsersBlogsComments(int blogcommentsId);
	List<BlogComments> mainList();
	BlogComments getBlogCommentsById(int blogcommentsId);
	boolean addBlogComments(BlogComments blogcomments);
	boolean updateBlogComments(BlogComments blogcomments);
	boolean deleteBlogComments(BlogComments blogcomments);

}
