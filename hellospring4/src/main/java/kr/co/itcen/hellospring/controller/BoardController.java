package kr.co.itcen.hellospring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping Type + Method
 *
 */

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		return "BoardController:list";
	}

	@ResponseBody
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(Map<String, Object> map) { //매개변수로 설정해둔 곳으로 값이 다들어감. map으로 해줬기에 map안에 전부 다들어감
		return "redirect:/board/list";
	}

	@ResponseBody
	@RequestMapping(value="/view/{no}", method=RequestMethod.GET)
	public String view(@PathVariable("no") Long no) { //매개변수로 설정해둔 곳으로 값이 다들어감. map으로 해줬기에 map안에 전부 다들어감
		return "BoardController:view:" + no;
	}
	
}
