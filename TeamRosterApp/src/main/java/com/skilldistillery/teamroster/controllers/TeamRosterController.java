package com.skilldistillery.teamroster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.teamroster.data.TeamRosterDAO;
import com.skilldistillery.teamroster.entities.Player;
@Controller
public class TeamRosterController {
	
	@Autowired
	private TeamRosterDAO teamRosterDao;
	
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		
		model.addAttribute("DEBUG", teamRosterDao.findById(1));
			
		return "index";
	}
	
	@RequestMapping("getFilm.do")
	public String showFilm(@RequestParam Integer pid, Model model) {
		Player player = teamRosterDao.findById(pid);
				
				
		model.addAttribute("player", player);
		return "player/show";
	}

}
