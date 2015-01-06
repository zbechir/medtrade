package org.medTrade.service;

import java.util.List;

import org.medTrade.persistance.model.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public List<User> getAllUser();
}
