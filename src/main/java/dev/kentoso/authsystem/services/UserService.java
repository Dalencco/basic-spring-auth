package dev.kentoso.authsystem.services;

import dev.kentoso.authsystem.models.User;
import dev.kentoso.authsystem.web.dto.UserRegisterDto;

public interface UserService {
    
    User save(UserRegisterDto userRegisterDto);

}
