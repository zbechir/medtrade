package org.medTrade.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.medTrade.persistance.dao.RoleDao;
import org.medTrade.persistance.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class authentificationService implements UserDetailsService {
	@Autowired
	private UserDao daoU;

	@Autowired
	private RoleDao daoR;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		org.medTrade.persistance.model.User user = daoU.getByLogin(username);
		if (user != null) {
			User users = new User(user.getLogin(), user.getPassword(),
					user.getEnabled(), true, true, user.getLocked(),
					getAuthorities(user.getRole().getIdrole()));
			return users;
		}else{
			return null;

		}
	}

	public List<String> getRoles(Integer role) {

		List<String> roles = new ArrayList<String>();
		roles.add(daoR.getById(role).getNom());
		return roles;
	}

	public Collection<? extends GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}

	public static List<GrantedAuthority> getGrantedAuthorities(
			List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}
}
