package com.leminhduc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class reservationController {

		@RequestMapping("/bookingForm")
		public String bookingForm(Model model) {
			reservation res = new reservation();
			model.addAttribute("reservation", res);
			return "reservation-page";
		}
		@RequestMapping("/submitForm")
		public String submitForm(@ModelAttribute("reservation")reservation res) {
		 	return "confirmation-form";
		}
	}

