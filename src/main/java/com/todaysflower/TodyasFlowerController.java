package com.todaysflower;

import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/todaysflower")
@RequiredArgsConstructor
@Controller
public class TodyasFlowerController {
	@GetMapping("/home1")
	public String home1() {
		return "home/home1";
	}
	
	@GetMapping("/home2")
	public String home2() {
		return "home/home2";
	}
	
	@GetMapping("/company_introduction")
	public String company_introduction() {
		return "company_introduction/company_introduction";
	}
	
	@GetMapping("/notice")
	public String notice() {
		return "customer_center/notice";
	}
	
	@GetMapping("/faq")
	public String faq() {
		return "customer_center/faq";
	}
	
	@GetMapping("/inquiry1")
	public String inquiry1() {
		return "customer_center/inquiry1";
	}
	
	@GetMapping("/inquiry2")
	public String inquiry2() {
		return "customer_center/inquiry2";
	}
	
	@GetMapping("/my_page")
	public String mypage() {
		return "my_page/my_page";
	}
	
	@GetMapping("/mpi1")
	public String mpi1() {
		return "my_page/mpi1";
	}
	
	@GetMapping("/mpi2")
	public String mpi2() {
		return "my_page/mpi2";
	}
	
	@GetMapping("/Login")
	public String Login() {
		return "login/Login";
	}
	
	@GetMapping("/Join")
	public String Join() {
		return "login/Join";
	}
	
	@GetMapping("/FindID")
	public String FindID() {
		return "login/FindID";
	}
	
	@GetMapping("/FindPW")
	public String FindPW() {
		return "login/FindPW";
	}
	
	@GetMapping("/Shop1")
	public String Shop1() {
		return "shop/Shop1";
	}
	
	@GetMapping("/Shop2")
	public String Shop2() {
		return "shop/Shop2";
	}
	
	@GetMapping("/Shop3")
	public String Shop3() {
		return "shop/Shop3";
	}
}