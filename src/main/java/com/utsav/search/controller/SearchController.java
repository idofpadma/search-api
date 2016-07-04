package com.utsav.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SearchController {
	
	@RequestMapping(value="/utsav/search", method=RequestMethod.GET)
	public String search(){
		return "Search Result";
	}
}
