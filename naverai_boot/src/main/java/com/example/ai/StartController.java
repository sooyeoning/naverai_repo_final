package com.example.ai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
//http://localhost:8064/
	@GetMapping("/")
	public String start(){
//<<<<<<< test1
		System.out.println("김도현");
//=======
//<<<<<<< test1
		System.out.println("안녕하세요 하이");
//=======
//<<<<<<< main
		System.out.println("차유빈");
//=======
//<<<<<<< test1
		System.out.println("조성희강사");
// =======
//<<<<<<< test1
		System.out.println("print start");
//=======
//<<<<<<< test1
		System.out.println("강혜경강사");
//=======
		System.out.println("신연균");
//>>>>>>> test1
//>>>>>>> test1
//<<<<<<< test1
//=======
//>>>>>>> test1
//>>>>>>> test1
//>>>>>>> test1
//>>>>>>> test1
		return "start"; 
	}
}
