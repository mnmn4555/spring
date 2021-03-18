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
	   public String data(Model model, String param) {
	      model.addAttribute("d",param);
	      return "data"; //페이지명
	   }
	//   @RequestMapping("/board")
	//   public String board() {
//	      return "board";
	//   }
	   @RequestMapping("board")
	   public String board(Model model, @RequestParam("data") String id) {
	      model.addAttribute("id",id);
	      return "board";
	   }
	   @RequestMapping("/board2")
	   public String board2(Model model, @RequestParam(value="test", required=false, defaultValue="100") String id) {
	      model.addAttribute("id",id);
	      return "board";
	   }
	
}
