package app.tls.services.Imple;

import app.tls.dto.UserDto;
import app.tls.dto.UserRequestDto;
import app.tls.repository.UserRepository;
import app.tls.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserDto::fromUserModel).collect(Collectors.toList());
    }

    @Override
    public UserDto getContent(String id) {
        return UserDto.fromUserModel(userRepository.findUserByEmplid(id));
    }

    @Override
    public UserDto getContent2(String id, String sex) {
        return UserDto.fromUserModel(userRepository.findUserByEmplidAndGender(id, sex));
    }

    @Override
    public UserDto getContent3(UserRequestDto request) {
        return UserDto.fromUserModel(userRepository.findUserByEmplidAndGender(request.getEmplid(), request.getSex()));
    }


    @Override
    public UserDto getContent4(UserRequestDto request) {
        return UserDto.fromUserModelWithDocument(userRepository.findUserByEmplidAndGender(request.getEmplid(), request.getSex()));
    }
}
