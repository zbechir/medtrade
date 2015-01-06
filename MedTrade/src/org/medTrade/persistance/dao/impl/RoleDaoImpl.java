package org.medTrade.persistance.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.medTrade.persistance.dao.RoleDao;
import org.medTrade.persistance.model.Role;
import org.medTrade.persistance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public void add(Role role) {
		factory.getCurrentSession().save(role);
	}

	@Override
	public void del(Role role) {
		factory.getCurrentSession().delete(role);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getAll() {
		return factory.getCurrentSession().createQuery("from Role").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Role getById(Integer id) {
		List<Role> roles = factory.getCurrentSession()
				.createQuery("from Role where idrole = :id")
				.setInteger("id", id).list();
		if (roles.size() > 0) {
			return roles.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Role getByName(String Name) {
		List<Role> roles = factory.getCurrentSession()
				.createQuery("from Role where nom = :nom")
				.setString("nom", Name).list();
		if (roles.size() > 0) {
			return roles.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Role getByUser(User user) {
		return getById(user.getIdUser());
	}

	@Override
	public void update(Role role) {
		factory.getCurrentSession().update(role);
	}

}
