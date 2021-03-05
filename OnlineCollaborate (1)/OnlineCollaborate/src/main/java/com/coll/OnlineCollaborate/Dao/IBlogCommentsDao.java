package com.coll.OnlineCollaborate.Dao;
import java.util.List;

import com.coll.OnlineCollaborate.model.Blog;
import com.coll.OnlineCollaborate.model.BlogComments;

public interface IBlogCommentsDao {
	List<BlogComments> getAllBlogsComments();
	List<BlogComments> getCommentsbyBlog(int blog);
	List<BlogComments> getBlogsCommentsByStatus(String status);
	
	BlogComments getBlogCommentsById(int blogcommentsId);
	boolean addBlogComments(BlogComments blogComments);
	boolean updateBlogComments(BlogComments blogComments);
	boolean deleteBlogComments(BlogComments blogComments);

}
