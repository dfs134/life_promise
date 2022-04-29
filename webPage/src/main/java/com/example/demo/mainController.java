package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	
	@RequestMapping("/")
    public String index(){
        return "contents/index";
    }
	
	@RequestMapping("/index")
    public String main(){
        return "contents/index";
    }
	
	@RequestMapping("/shop")
	public String shop() {
		return "contents/shop";
	}
	
	@RequestMapping("/brand")
	public String brand() {
		return "contents/brand";
	}
	
	@RequestMapping("/event")
	public String event() {
		return "contents/event";
	}
	
	@RequestMapping("/service")
	public String service() {
		return "contents/service";
	}
	
	@RequestMapping("/offline")
	public String offline() {
		return "contents/offline";
	}
	
	@RequestMapping("/mypage")
	public String mypage() {
		return "contents/mypage";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "contents/write";
	}
	
	@RequestMapping("/terms")
	public String terms() {
		return "contents/terms";
	}
	
	@RequestMapping("/shoppingBasket")
	public String shoppingBasket() {
		return "contents/shoppingBasket";
	}
	
	@RequestMapping("/order")
	public String order() {
		return "contents/order";
	}
	
	@RequestMapping("/infoProcess")
	public String infoProcess() {
		return "contents/infoProcess";
	}
	
	@RequestMapping("/findId")
	public String findId() {
		return "contents/findId";
	}
	
	@RequestMapping("/findPw")
	public String findPw() {
		return "contents/findPw";
	}
	
	@RequestMapping("/detailpage")
	public String detailpage() {
		return "contents/detailpage";
	}
	
	@RequestMapping("/changeInfo")
	public String changeInfo() {
		return "contents/changeInfo";
	}
}
