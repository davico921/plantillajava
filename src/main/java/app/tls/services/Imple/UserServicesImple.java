package app.tls.services.Imple;

import java.util.List;

import app.tls.model.Documento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.tls.model.User;
import app.tls.model.request.UserRequest;
import app.tls.model.response.UserResponse;
import app.tls.repository.UserRepository;
import app.tls.services.UserServices;

@Service
public class UserServicesImple  implements UserServices {
	
	@Autowired	
	UserRepository repo;
	
	@Override
	public List<UserResponse> listar() {
		return repo.listar();
	}
	
	@Override
	public  UserResponse getContenido(String id) {
		return repo.getContenido(id);
	}
	
	@Override
	public  UserResponse getContenido2 (String id , String sex) {
		return repo.getContenido2(id,sex);
	}
	
	@Override
	public  List<UserResponse> getContenido3(UserRequest request) {
		return repo.getContenido3(request);
	}


	@Override
	public  List<UserResponse> getContenido4(UserRequest request) {

		 List<UserResponse> users = repo.getContenido3(request);

		for (UserResponse user:users) {

			Documento doc = repo.getContenido4(request);
			user.setDocumentos(doc);
		}

		return users;
	}




}
