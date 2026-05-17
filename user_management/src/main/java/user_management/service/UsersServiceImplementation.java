package user_management.service;

import org.springframework.stereotype.Service;

import user_management.repository.UsersRepository;

@Service
public class UsersServiceImplementation {
	UsersRepository userRepository;

	public UsersServiceImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersServiceImplementation(UsersRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	  
}
