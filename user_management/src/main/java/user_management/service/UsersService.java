package user_management.service;

import java.util.List;

import user_management.dto.UsersRequestDto;
import user_management.dto.UsersResponseDto;

public interface UsersService {
	String register(UsersRequestDto user);
	UsersResponseDto searchUser(Long id);
	List<UsersResponseDto> viewAllUsers();
	String updateUser(UsersRequestDto user);
	String deleteUser(Long id);
}
