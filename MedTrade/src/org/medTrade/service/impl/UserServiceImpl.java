package org.medTrade.service.impl;

import java.util.List;

import org.medTrade.persistance.dao.UserDao;
import org.medTrade.persistance.model.User;
import org.medTrade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	@Override
	public void addUser(User user) {
		dao.add(user);
	}

	@Override
	public void updateUser(User user) {
		dao.update(user);
	}

	@Override
	public List<User> getAllUser() {
		return dao.getAll();
	}

}
