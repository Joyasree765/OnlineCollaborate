package com.coll.OnlineCollaborate.Dao;
import java.util.List;

import com.coll.OnlineCollaborate.model.User;

public interface IUserDao {
	List<User> userListbyStatus(String status);
	List<User> getAllUsers();
	User getUserById(int UserId);
	User getUserByUserName(String Username);
	User validateUser(User user);
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int userId);
	boolean deactiveUser(int userId);
	boolean logoutUser(int userId);
	List<User> getAllDeactiveUser();
	boolean activeUser(int userId);
	boolean updateUserProfile(String file,Integer userId);

}
