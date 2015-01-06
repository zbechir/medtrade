package org.medTrade.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.medTrade.persistance.model.Role;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleServiceTest {

	
	private static ClassPathXmlApplicationContext context;
	private static RoleService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("org/medTrade/medTrade-context.xml");
		service=(RoleService) context.getBean("RoleService");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testGetAll() {
		List<Role> roles = service.getAll();
		assertNotNull(roles);
		assertTrue(roles.size()>0);
	}

	@Test
	public void testGetById() {
		fail("Not yet implemented");
	}

}
