package com.bd.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.pojo.Animal;
import com.bd.service.AnimalService;


@Controller
public class AnimalController {

	@Autowired
	private AnimalService service;
	
	@RequestMapping("/list")
	public String list(Model model,Integer page) {
		List<Animal> list=service.list();
		//System.out.println(11111);
		model.addAttribute("list", list);
		return "/list";
	}
	
	
}
