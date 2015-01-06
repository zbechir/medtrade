package org.medTrade.persistance.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.medTrade.persistance.dao.UserDao;
import org.medTrade.persistance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public void add(User user) {
		factory.getCurrentSession().save(user);
	}

	@Override
	public void del(User user) {
		factory.getCurrentSession().delete(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		return factory.getCurrentSession().createQuery("from User").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getById(Integer id) {
		List<User> users = factory.getCurrentSession()
				.createQuery("from User where idUser = :id")
				.setInteger("id", id).list();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getByLogin(String Login) {
		List<User> users = factory.getCurrentSession()
				.createQuery("from User where login = :id")
				.setString("id", Login).list();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void update(User user) {
		factory.getCurrentSession().update(user);
	}

}
