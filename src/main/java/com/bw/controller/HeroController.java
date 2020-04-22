package com.bw.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.bean.Hero;
import com.bw.service.HeroService;

@Controller
public class HeroController {
	@Resource
	private HeroService hService;
	
	@RequestMapping("queryAll")
	public String List(Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		java.util.List<Hero> list = hService.queryAll(map);
		model.addAttribute("list", list);
		return "list";
		
	}
}
