package com.skilldistillery.teamroster.data;

import java.util.List;

import com.skilldistillery.teamroster.entities.Player;

public interface TeamRosterDAO {
	
	Player findById(int playerId);
	
	List <Player> findAll();
	
	public Player create(Player player);
	
	public Player update(int id, Player player);
	
	public boolean destroy(int id);
	

}
