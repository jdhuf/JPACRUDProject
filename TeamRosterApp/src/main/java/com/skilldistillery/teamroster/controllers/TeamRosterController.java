package com.skilldistillery.teamroster.controllers;

import java.sql.SQLException;

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
	
	
	
//	@RequestMapping(path = "FindPlayerByID.do", params = "playerID", method = RequestMethod.GET)
//	public ModelAndView findPlayerByID(@RequestParam("pid") int pid) {
//		ModelAndView mv = new ModelAndView();
//
//		Player player = null;
//		player = teamRosterDao.findById(pid);
//		mv.addObject("player", player);
//		mv.setViewName("player/read");
//
//		return mv;
//
//	}
	
	
	
	
	
	@RequestMapping("getPlayer.do")
	public String showPlayer(@RequestParam Integer pid, Model model) {
		Player player = teamRosterDao.findById(pid);
				
				
		model.addAttribute("player", player);
		
		return "player/read";
	}
	
	@RequestMapping(path = {"updatePlayer.do"}, method = RequestMethod.POST)
	public String updatePlayer(Integer id, String updateName, String birthdate, String position, String homeTown,
			String nationality, int height, int weight, Model model) {
		

		Player updatePlayer = new Player();

		
		updatePlayer.setName(updateName);
		updatePlayer.setBirthdate(birthdate);
		updatePlayer.setPosition(position);
		updatePlayer.setHomeTown(homeTown);
		updatePlayer.setNationality(nationality);
		updatePlayer.setHeight(height);
		updatePlayer.setWeight(weight);
		
		
		
		teamRosterDao.update(id, updatePlayer);
		model.addAttribute("player", updatePlayer);
		
		return "player/read";

		
	}
	
//	@RequestMapping("updatePlayer.do")
//	public String updatePlayer() {
//		
//		return null;
//		
//	}
	
	@RequestMapping(path = {"addPlayer.do"}, method = RequestMethod.POST)
	public String createPlayer(@RequestParam String createName, Model model, int weight, int height, String nationality, String homeTown, String position, String birthdate, Integer id) {
		
		System.out.println("Hi");
		
		Player newPlayer = new Player();
		
	//	newPlayer.setId(0);
		newPlayer.setName(createName);
		newPlayer.setBirthdate(birthdate);
		newPlayer.setPosition(position);
		newPlayer.setHomeTown(homeTown);
		newPlayer.setNationality(nationality);
		newPlayer.setHeight(height);
		newPlayer.setWeight(weight);
		
		try {
			teamRosterDao.create(newPlayer);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		model.addAttribute("player", newPlayer);
		
		return "player/created";
		
	}
	
	
	
	@RequestMapping(path = {"deletePlayer.do"}, method = RequestMethod.GET)
	public String index(@RequestParam Integer destroyId, Model model) {
		
		model.addAttribute("playerDelete", teamRosterDao.destroy(destroyId));
		return "player/deleted";
	}
	
	
	
	@RequestMapping(path = {"/", "index.do"}, method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("playersAll", teamRosterDao.findAll());
		return "index";
	}

}
