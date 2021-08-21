package app.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {
	private final UserRepository userRepository;
	
	public List<User> all() {
		return userRepository.findAll();
	}
}
