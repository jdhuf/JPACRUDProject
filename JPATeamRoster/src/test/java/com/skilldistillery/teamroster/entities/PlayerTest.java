package com.skilldistillery.teamroster.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.bytebuddy.matcher.ElementMatcher;

class PlayerTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Player player;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		emf = Persistence.createEntityManagerFactory("JPATeamRoster");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
		
	}
	
	

	@BeforeEach
	void setUp() throws Exception {
		
		em = emf.createEntityManager();
		player = em.find(Player.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		em.close();
		player = null;
	}

	@Test
	void test() {
		assertNotNull(player);
		assertEquals("Joe Shmow", player.getName());
	}

}
