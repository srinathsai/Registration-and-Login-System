package registerationlogin.service;

import registerationlogin.dto.UserDto;
import registerationlogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto>findAllUsers();
}
