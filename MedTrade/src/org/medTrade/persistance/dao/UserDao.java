package org.medTrade.persistance.dao;

import java.util.List;
import org.medTrade.persistance.model.User;

public interface UserDao {
	public void add(User user);

	public void del(User user);
	
	public void update(User user);

	public List<User> getAll();

	public User getById(Integer id);

	public User getByLogin(String Login);
}
