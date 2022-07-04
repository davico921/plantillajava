package app.tls.controller;


import app.tls.dto.UserDto;
import app.tls.dto.UserRequestDto;
import app.tls.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService userService;


    @GetMapping("/listar")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> obj = userService.getAllUsers();
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }


    @GetMapping("/api/{id}")
    @ResponseBody
    public UserDto getById(@PathVariable String id) {
        return userService.getContent(id);
    }

    @GetMapping("/api2/{id}/{sex}")
    @ResponseBody
    public UserDto getById2(@PathVariable String id, @PathVariable String sex) {
        return userService.getContent2(id, sex);
    }

    @PostMapping("/")
    public UserDto userPost(@RequestBody UserRequestDto body) {
        return userService.getContent3(body);
    }

    @PostMapping("/Documento")
    public UserDto userPost2(@RequestBody UserRequestDto body) {
        return userService.getContent4(body);
    }
}






