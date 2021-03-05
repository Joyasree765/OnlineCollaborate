package com.coll.OnlineCollaborate.DaoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaborate.Dao.IBlogCommentsDao;
import com.coll.OnlineCollaborate.model.Blog;
import com.coll.OnlineCollaborate.model.BlogComments;

@Repository("blogCommentsDao")
@Transactional
public class BlogCommentsDaoImpl implements IBlogCommentsDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<BlogComments> getAllBlogsComments() {
	
		return sessionFactory.getCurrentSession().createQuery("from BlogComments",BlogComments.class).getResultList();
	}

	@Override
	public List<BlogComments> getBlogsCommentsByStatus(String status) {
		String q="from BlogComments where status='"+status+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(q);
		return query.getResultList();
	}
	
	public List<BlogComments> getCommentsbyBlog(int blog){
		return null;
	}

	@Override
	public BlogComments getBlogCommentsById(int blogcommentsId) {
		return sessionFactory.getCurrentSession().get(BlogComments.class,Integer.valueOf(blogcommentsId));
	}

	@Override
	public boolean addBlogComments(BlogComments blogcomments) {
		try
		{
			sessionFactory.getCurrentSession().save(blogcomments);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateBlogComments(BlogComments blogcomments) {
		try
		{
			sessionFactory.getCurrentSession().update(blogcomments);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteBlogComments(BlogComments blogcomments) {
		try
		{
			sessionFactory.getCurrentSession().delete(blogcomments);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	



}
