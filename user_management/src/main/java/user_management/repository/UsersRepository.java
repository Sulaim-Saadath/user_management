package user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user_management.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
}
