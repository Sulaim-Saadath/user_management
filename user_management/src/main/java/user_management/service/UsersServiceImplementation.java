package user_management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user_management.dto.UsersRequestDto;
import user_management.dto.UsersResponseDto;
import user_management.entity.Users;
import user_management.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {
	UsersRepository userRepository;

	public UsersServiceImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public UsersServiceImplementation(UsersRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public String register(UsersRequestDto user) {
		Users users = new Users();
		users.setUserName(user.getUserName());
		users.setPassword(user.getPassword());
		users.setMobile(user.getMobile());
		users.setEmail(user.getEmail());
		users.setDob(user.getDob());
		users.setDpUrl(user.getDpUrl());
		users.setAddress(user.getAddress());
		users.setGender(user.getGender());
		userRepository.save(users);
		return "User registered Succesfully!";
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		Users user = userRepository.findById(id).get();
		UsersResponseDto userResponseDto = new UsersResponseDto();
		userResponseDto.setUsername(user.getUserName());
		userResponseDto.setMobile(user.getMobile());
		userResponseDto.setEmail(user.getEmail());
		userResponseDto.setGender(user.getGender());
		userResponseDto.setAddress(user.getAddress());
		userResponseDto.setDob(user.getDob());
		userResponseDto.setDpUrl(user.getDpUrl());
		return userResponseDto;
	}

	@Override
	public List<UsersResponseDto> viewAllUsers() {
		List<Users> userList = userRepository.findAll();
		List<UsersResponseDto> userResponseList = new ArrayList<UsersResponseDto>();
		for (Users user : userList) {
			UsersResponseDto userResponseDto = new UsersResponseDto(user.getUserName(), user.getMobile(),
					user.getEmail(), user.getDob(), user.getGender(), user.getAddress(), user.getDpUrl());
			userResponseList.add(userResponseDto);
		}
		return userResponseList;

	}

	@Override
	public String updateUser(UsersRequestDto user) {
		Users users = new Users();
		users.setUserName(user.getUserName());
		users.setPassword(user.getPassword());
		users.setMobile(user.getMobile());
		users.setEmail(user.getEmail());
		users.setGender(user.getGender());
		users.setAddress(user.getAddress());
		users.setDob(user.getDob());
		users.setDpUrl(user.getDpUrl());
		userRepository.save(users);
		return "User Updated Succesfully";
	}

	@Override
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		return "User deleted succesfully";
	}

}
