package com.ltts.controller;




import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.Dao.BookTicketDao;
import com.ltts.model.BookTicket;




@RestController
public class BookTicketController {
	@Autowired
	BookTicketDao bt;
	
	@RequestMapping("")
	public ModelAndView secondMethod() {
		return new ModelAndView("login");
	}
	@RequestMapping("/Book")
	public ModelAndView thirdMethod() {
		return new ModelAndView("Book");
	}
	
	@RequestMapping(value="Booking",method=RequestMethod.POST)
	public ModelAndView Booking(HttpServletRequest req, Model model,HttpSession httpSession) {
		ModelAndView mv=null;
		String date = req.getParameter("bookingDate");
		String date1 = req.getParameter("showDate");
		int AvaliableSeats=Integer.parseInt(req.getParameter("AvaliableSeats"));
		int TotalSeats=500;
		int noOfTickets=TotalSeats-AvaliableSeats;
		httpSession.setAttribute("nt", noOfTickets);
		
		BookTicket n=new BookTicket(date,date1,noOfTickets);
		boolean b=bt.InsertBooking(n);
		if(b==true) {
			mv=new ModelAndView("success");
			
		}
		else {
			mv=new ModelAndView("error");
			model.addAttribute("msg","Error due to Connections");
		}
		
		return mv;
		
	}


}
