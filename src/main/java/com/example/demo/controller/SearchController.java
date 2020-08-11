package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ShainInfoForm;
import com.example.demo.mapper.ShainMapper;

@Controller
public class SearchController {
	
	@Autowired
	ShainMapper shainMapper;
	
	
	@ModelAttribute
	public ShainInfoForm setUpForm() {
		// ShainInfoFormを初期化
		return new ShainInfoForm();
	}
	
	// １：ソースの流れ → search.html
	@RequestMapping("/search")
	public String index() {
		return "search.html";
	}
	
	@RequestMapping("/result")
	public String result(@Validated ShainInfoForm shainInfoForm, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "search.html";
		}
		
		List<ShainInfoForm> list = shainMapper.selectAll();
		model.addAttribute("ksk",list);
		//		String id = shainInfoForm.getId();
//		String name = shainInfoForm.getName();
//		String sex = shainInfoForm.getSex();
//		String position = shainInfoForm.getPosition();
//		
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("sex", sex);
//		model.addAttribute("position", position);
		return "result.html";
	}
}
