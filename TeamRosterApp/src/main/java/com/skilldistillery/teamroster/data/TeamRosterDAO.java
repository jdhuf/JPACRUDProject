package com.skilldistillery.teamroster.data;

import java.util.List;

import com.skilldistillery.teamroster.entities.Player;

public interface TeamRosterDAO {
	
	Player findById(int playerId);
	List <Player> findAll();
	
//	Player findAll();

}
