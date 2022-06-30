package app.tls.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.tls.model.User;
import app.tls.model.request.UserRequest;
import app.tls.model.response.UserResponse;
import app.tls.services.UserServices;

import java.util.List;



@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserServices service;
	
	

	@GetMapping("/listar")
    public ResponseEntity<List<UserResponse>> listar(){
		List<UserResponse> obj = service.listar();
		return new ResponseEntity<List<UserResponse>>(obj,HttpStatus.OK);	
		
	}	

	
	
	@GetMapping("/api/{id}")
	@ResponseBody
    public UserResponse BuscarPorId(@PathVariable  String id ) {
		System.out.println("buena"+id);
        return service.getContenido(id);
    }
	
	@GetMapping("/api2/{id}/{sex}")
	@ResponseBody
    public UserResponse BuscarPorId2(@PathVariable  String id , @PathVariable String sex ) {
		System.out.println("buena"+id+sex);
        return service.getContenido2(id,sex);
    }
	
	
	@PostMapping("/")
	public List<UserResponse>Userpost(@RequestBody UserRequest body){
		return service.getContenido3(body);
	}

	@PostMapping("/Documento")
	public List<UserResponse>Userpost2(@RequestBody UserRequest body){
		return service.getContenido4(body);


	}

}






