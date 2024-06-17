package com.goldendust.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.goldendust.blog.dto.MemberDto;

@Controller
public class BlogController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String blogHome() {
		
		return "home";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "sample1";
	}
	
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String member() {
		return "user/member";	// 특정 폴더 내의 jsp파일 실행
	}
	
	@RequestMapping(value="/user/test2", method=RequestMethod.GET)
	public String test2() {
		return "sample2";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
//	@RequestMapping(value="/loginOk")
//	public String loginOk(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("memberID");
//		String mpw = request.getParameter("memberPW");
//		
//		// 객체에 실어 보내기 -> model (프런트에 보내는 배달통)
//		model.addAttribute("login_id", mid);
//		model.addAttribute("login_pw", mpw);
//		model.addAttribute("user", "홍길동");
//		// jsp에서 EL표기법으로 빼서 쓸 수 있음
//		
//		return "loginOk";
//	}
	
//	@RequestMapping()
//	public ModelAndView loginOk(HttpServletRequest request, ModelAndView mv) {
//		
//		String mid = request.getParameter("memberID");
//		String mpw = request.getParameter("memberPW");
//		
//		mv.addObject("login_id", mid);
//		mv.addObject("login_pw", mpw);
//		mv.addObject("user", "홍길동");
//		// Model과 ModelAndView 다른 점? view name 설정 가능
//		mv.setViewName("loginOk");
//		
//		return mv;
//	}
	
	@RequestMapping("/member")
	public String member(Model model) {
		
		model.addAttribute("mname", "홍길동");
		
		return "user/member";
	}
	
	@RequestMapping()
	public ModelAndView loginOk(@RequestParam("memberID") String mid, 
			@RequestParam("memberPW") String mpw, ModelAndView mv) {
		
		mv.addObject(mid);
		mv.addObject(mpw);
		
		return mv;
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
//	@RequestMapping("/joinOk")
//	public String joinOk(HttpServletRequest request, Model model) {
//		String mid = request.getParameter("memberID");
//		String mpw = request.getParameter("memberPW");
//		String mname = request.getParameter("memberName");
//		int mage = Integer.parseInt(request.getParameter("memberAge"));
//		String memail = request.getParameter("memberEmail");
//		
//		MemberDto newMember = new MemberDto(mid, mpw, mname, mage, memail);
//		
//		model.addAttribute("member", newMember);
//		
//		return "joinOk";
//	}
	
	@RequestMapping(value="/joinOk", produces = "application/json")
	public String joinOk(MemberDto newMember, Model model) {
		// 파라미터 값이 jsp input name과 같음 + setter 가 있음 => 자동으로 객체 생성해 줌
		model.addAttribute("member", newMember);
		
		return "joinOk";
	}
	
	@RequestMapping(value="/student/{studentID}")
	public String student(@PathVariable("studentID") String studentID, Model model) {
		model.addAttribute("sid", studentID);
		return "user/studentid";
	}
	
}
