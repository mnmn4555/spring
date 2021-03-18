package kr.ac.inhatc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JspControlller {
	@RequestMapping("/")
	public String index() {
		return "hello";
	}
	@RequestMapping("/hihi")
	public String index2() {
		return "hello";
	}
	
	@RequestMapping("/data")
	public String data(Model model,String param) {
		model.addAttribute("d",param);
		return "data";
	}
	@RequestMapping("/board")
	public String board(Model model, 
			@RequestParam(value="data", required = false, defaultValue = "제목없음")String id){
		model.addAttribute("id",id);
		return "borad";
	}
	
}
