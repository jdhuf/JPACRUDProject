package com.skilldistillery.teamroster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.teamroster.data.TeamRosterDAO;
import com.skilldistillery.teamroster.entities.Player;
@Controller
public class TeamRosterController {
	
	@Autowired
	private TeamRosterDAO teamRosterDao;
	
	
//	@RequestMapping(path = {"/", "home.do"})
//	public String index(Model model) {
//		
//		model.addAttribute("DEBUG", teamRosterDao.findById(1));
//			
//		return "index";
//	}
	
	
	
	@RequestMapping("getPlayer.do")
	public String showPlayer(@RequestParam Integer pid, Model model) {
		Player player = teamRosterDao.findById(pid);
				
				
		model.addAttribute("player", player);
		
		return "player/read";
	}
	
	@RequestMapping("updatePlayer.do")
	public String updatePlayer() {
		
		return null;
		
	}
	
	@RequestMapping("createPlayer.do")
	public String createPlayer(@RequestParam String name, Model model) {
		
		System.out.println("Hi");
		
		Player newPlayer = new Player();
		
		newPlayer.setId(0);
		newPlayer.setName("Joe");
		newPlayer.setBirthdate("Jones");
		newPlayer.setPosition("Defender");
		newPlayer.setHomeTown("Miami");
		newPlayer.setNationality("USA");
		newPlayer.setHeight(70);
		newPlayer.setWeight(155);
		
		try {
			teamRosterDao.create(newPlayer);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		model.addAttribute("name", newPlayer);
		
		return "player/created";
		
	}
	
	@RequestMapping(path = {"deletePlayer.do"}, method = RequestMethod.GET)
	public String index(@RequestParam Integer pid, Model model) {
		
		model.addAttribute("player", teamRosterDao.destroy(pid));
		return "player/deleted";
	}
	
	@RequestMapping(path = {"/", "index.do"}, method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("playersHi", teamRosterDao.findAll());
		return "index";
	}

}
