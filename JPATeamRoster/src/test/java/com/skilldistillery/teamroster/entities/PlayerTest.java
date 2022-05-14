package com.skilldistillery.teamroster.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


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
		player = em.find(Player.class, 4);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		player = null;
	}

	@Test
	@DisplayName("testing basic player mappings")
	void test1() {
		assertNotNull(player);
		assertEquals("Robbie Robinson", player.getName());
		assertEquals("17 Dec 1998", player.getBirthdate());
		assertEquals(74, player.getHeight());
		assertEquals(170, player.getWeight());
	}

}
