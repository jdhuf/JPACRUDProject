package com.skilldistillery.teamroster.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.teamroster.entities.Player;


@Transactional
@Service

public class TeamRosterDaoJpaImpl implements TeamRosterDAO{
	@PersistenceContext
	private EntityManager em;

	@Override
	public Player findById(int playerId) {
		
		return em.find(Player.class, playerId);
	}
	


	@Override
	public Player findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}