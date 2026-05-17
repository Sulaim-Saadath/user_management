package user_management.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;

import user_management.service.UsersService;

public class UsersController {
	UsersService userService;

	public UsersController(UsersService userService) {
		super();
		this.userService = userService;
	}

	public UsersController() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}
