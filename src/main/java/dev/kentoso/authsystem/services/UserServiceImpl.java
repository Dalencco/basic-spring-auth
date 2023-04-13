package dev.kentoso.authsystem.services;

import java.util.Arrays;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import dev.kentoso.authsystem.models.User;
import dev.kentoso.authsystem.models.Role;
import dev.kentoso.authsystem.repositories.UserRepository;
import dev.kentoso.authsystem.web.dto.UserRegisterDto;

@Service
public class UserServiceImpl implements UserService {
    
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegisterDto userRegisterDto) {
        
        User user = new User(userRegisterDto.getUsername(), userRegisterDto.getEmail(),
                BCrypt.hashpw(userRegisterDto.getPassword(), BCrypt.gensalt(10)), Arrays.asList(new Role("user")));

        return userRepository.save(user);
    }

}
