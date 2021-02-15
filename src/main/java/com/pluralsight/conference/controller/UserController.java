package com.pluralsight.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstname", defaultValue = "Hokushin") String firstname,
						@RequestParam(value = "lastname", defaultValue = "_") String lastname,
						@RequestParam(value = "age", defaultValue = "41") int age) {
		User user = new User();
		
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setAge(age);
		
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println(this.getClass() + "User:" + user.getFirstName());
		
		return user;
	}
	
}
