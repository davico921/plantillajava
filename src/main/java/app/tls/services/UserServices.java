package app.tls.services;

import java.util.List;

import org.springframework.stereotype.Service;

import app.tls.model.request.UserRequest;
import app.tls.model.response.UserResponse;


@Service
public interface UserServices {
	List<UserResponse> listar();	
	UserResponse getContenido(String id);
	UserResponse getContenido2(String id,String sex);
	List<UserResponse> getContenido3(UserRequest request);

	List<UserResponse> getContenido4(UserRequest request);
}
