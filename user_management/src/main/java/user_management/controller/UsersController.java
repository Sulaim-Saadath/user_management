 package user_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import user_management.dto.UsersRequestDto;
import user_management.dto.UsersResponseDto;

import user_management.service.UsersService;

@RestController
public class UsersController {
	UsersService userService;

	@Autowired
	public UsersController(UsersService userService) {
		super();
		this.userService = userService;
	}

	public UsersController() {
		super();
		// TODO Auto-generated constructor stub
	}

	// localhost:8080/register
	@PostMapping("/register")
	public String register(@RequestBody UsersRequestDto user) {
		return userService.register(user);
	}

	@GetMapping("/searchUser/{id}")
	public UsersResponseDto searchUser(@PathVariable Long id) {
		return userService.searchUser(id);
	}

	@GetMapping("/viewAllUsers")
	public List<UsersResponseDto> viewAllUsers() {
		return userService.viewAllUsers();
	}

	@PutMapping("/updateUser")
	public String updateUser(@RequestBody UsersRequestDto user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}
