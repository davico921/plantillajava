package app.tls.services;

import app.tls.dto.UserDto;
import app.tls.dto.UserRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
    List<UserDto> getAllUsers();

    UserDto getContent(String id);

    UserDto getContent2(String id, String sex);

    UserDto getContent3(UserRequestDto request);

    UserDto getContent4(UserRequestDto request);
}
