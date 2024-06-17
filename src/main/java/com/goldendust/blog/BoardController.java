package com.goldendust.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping("/gallery")
	public String gallery() {
		return "board/gallery";
	}
	
	@RequestMapping("/free")
	public String free() {
		return "board/free";
	}

}
