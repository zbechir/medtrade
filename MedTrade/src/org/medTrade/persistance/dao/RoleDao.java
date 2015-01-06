package org.medTrade.persistance.dao;

import java.util.List;

import org.medTrade.persistance.model.Role;
import org.medTrade.persistance.model.User;

public interface RoleDao {
	public void add(Role role);

	public void del(Role role);
	
	public void update(Role role);

	public List<Role> getAll();

	public Role getById(Integer id);

	public Role getByName(String Name);

	public Role getByUser(User user);
}
