package com.skilldistillery.teamroster.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.teamroster.entities.Player;

@Transactional
@Service

public class TeamRosterDaoJpaImpl implements TeamRosterDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Player findById(int playerId) {

		return em.find(Player.class, playerId);
	}


	@Override
	public List<Player> findAll() {
		String jpql = "SELECT p FROM Player p";

		return em.createQuery(jpql, Player.class).getResultList();
	}

	@Override
	public Player create(Player player) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATeamRoster");
		EntityManager em = emf.createEntityManager();
		// start the transaction
		em.getTransaction().begin();
		// write the actor to the database
		em.persist(player);
		// update the "local" Player object
		em.flush();
		// commit the changes (actually perform the operation)
		em.getTransaction().commit();

		em.close();

		emf.close();

		return player;

	}

	@Override
	public Player update(int id, Player player) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATeamRoster");
		EntityManager em = emf.createEntityManager();

		Player dbPlayer = em.find(Player.class, id);

		if (dbPlayer != null) {

			em.getTransaction().begin();

			dbPlayer.setName(player.getName());
			dbPlayer.setBirthdate(player.getBirthdate());
			dbPlayer.setPosition(player.getPosition());
			dbPlayer.setHomeTown(player.getHomeTown());
			dbPlayer.setNationality(player.getNationality());
			dbPlayer.setHeight(player.getHeight());
			dbPlayer.setWeight(player.getWeight());

			em.getTransaction().commit();

		}

		em.close();
		emf.close();
		return dbPlayer;
	}

	@Override
	public boolean destroy(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATeamRoster");
		EntityManager em = emf.createEntityManager();

		boolean successfullyKickedOut = false;

		Player poorPlayer = em.find(Player.class, id);

		if (poorPlayer != null) {
			em.getTransaction().begin();

			em.remove(poorPlayer);

			successfullyKickedOut = !em.contains(poorPlayer);

			em.getTransaction().commit();
		}

		return successfullyKickedOut;
	}
}
