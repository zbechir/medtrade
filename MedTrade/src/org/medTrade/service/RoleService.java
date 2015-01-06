package org.medTrade.service;

import java.util.List;

import org.medTrade.persistance.model.Role;

public interface RoleService {
	public List<Role> getAll();

	public Role getById(Integer Id);
}
