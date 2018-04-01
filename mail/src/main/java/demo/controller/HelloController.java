package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import demo.service.MailService;



@Controller
public class HelloController {
	@Autowired
	private MailService mailService;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		mailService.sendSimpleMail("547149484@qq.com","test","test");
		return "hello";
	}
}
