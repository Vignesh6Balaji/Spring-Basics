package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, @RequestParam("t3") int c){
		System.out.println("Request is fetching...");
		/*
		 * Parameters for getting request from the user
		 * HttpServletRequest request, HttpServletResponse response
		 * int i = Integer.parseInt(request.getParameter("t1")); int j =
		 * Integer.parseInt(request.getParameter("t2"));
		 */
		/*
		 * Scanner sc=new Scanner(System.in); System.out.
		 * println("Enter 1 for Add \nEnter 2 for Sub \nEnter 3 for Mul \nEnter 4 for Div"
		 * ); int c=sc.nextInt();
		 */
		int key=0;
		String str=null;
		switch (c) {
		case 1:
			key=new AddService().add(i, j);
			break;
		case 2:
			key=new AddService().sub(i, j);
			break;
		case 3:
			key=new AddService().mul(i, j);
			break;
		case 4:
			key=new AddService().div(i, j);
			break;
		default:
			str="Enter valid choice !!!";
			break;
		}
		System.out.println(key);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("res", key);
		mv.addObject("string", str);
		return mv;
	}
}
