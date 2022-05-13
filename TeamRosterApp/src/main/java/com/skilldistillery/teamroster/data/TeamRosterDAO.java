package com.skilldistillery.teamroster.data;

import com.skilldistillery.teamroster.entities.Player;

public interface TeamRosterDAO {
	
	Player findById(int playerId);
	
	Player findAll();

}
