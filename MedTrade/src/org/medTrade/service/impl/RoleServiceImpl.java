package org.medTrade.service.impl;

import java.util.List;

import org.medTrade.persistance.dao.RoleDao;
import org.medTrade.persistance.model.Role;
import org.medTrade.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service("RoleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao dao;
	@Override
	public List<Role> getAll() {
		return dao.getAll();
	}

	@Override
	public Role getById(Integer Id) {
		return dao.getById(Id);
	}

}
