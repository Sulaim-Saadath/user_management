package user_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import user_management.dto.UsersRequestDto;
import user_management.dto.UsersResponseDto;
import user_management.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {
	UsersRepository userRepository;

	public UsersServiceImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersServiceImplementation(UsersRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public String register(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersResponseDto> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	  
}
