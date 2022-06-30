package app.tls.repository;
import java.util.List;

import app.tls.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.tls.model.request.UserRequest;
import app.tls.model.response.UserResponse;

public interface UserRepository extends JpaRepository<UserResponse, String>{

	
	@Query(value ="SELECT\r\n"
			+ "DATA.EMPLID,\r\n"
			+ "DATA.LAST_NAME APELLIDO_PATERNO,\r\n"
			+ "DATA.SECOND_LAST_NAME APELLIDO_MATERNO ,\r\n"
			+ "DATA.FIRST_NAME NOMBRES,\r\n"
			+ "DATA.BIRTHDATE FECHA_NACIMIENTO,\r\n"
			+ "DATA.MAR_STATUS ESTADO_CIVIL,\r\n"
			+ "DATA.SEX GENERO \r\n"
			+ "FROM PS_PERSONAL_DATA DATA\r\n",nativeQuery = true 
			)
		List<UserResponse> listar();	
	
	@Query(value = "SELECT\r\n"
			+ "DATA.EMPLID,\r\n"
			+ "DATA.LAST_NAME APELLIDO_PATERNO,\r\n"
			+ "DATA.SECOND_LAST_NAME APELLIDO_MATERNO,\r\n"
			+ "DATA.FIRST_NAME NOMBRES,\r\n"
			+ "DATA.BIRTHDATE FECHA_NACIMIENTO,\r\n"
			+ "DATA.MAR_STATUS ESTADO_CIVIL,\r\n"
			+ "DATA.SEX GENERO \r\n"
			+ "FROM PS_PERSONAL_DATA DATA\r\n"	
			+"WHERE DATA.EMPLID = :id"
			,nativeQuery = true)
	          
	//public List<User> getContenido(@Param("id")String id );
	public UserResponse getContenido(@Param("id")String id );	
	
	@Query(value = "SELECT\r\n"
			+ "DATA.EMPLID,\r\n"
			+ "DATA.LAST_NAME APELLIDO_PATERNO,\r\n"
			+ "DATA.SECOND_LAST_NAME APELLIDO_MATERNO,\r\n"
			+ "DATA.FIRST_NAME NOMBRES,\r\n"
			+ "DATA.BIRTHDATE FECHA_NACIMIENTO,\r\n"
			+ "DATA.MAR_STATUS ESTADO_CIVIL,\r\n"
			+ "DATA.SEX GENERO \r\n"
			+ "FROM PS_PERSONAL_DATA DATA\r\n"	
			+"WHERE DATA.EMPLID = :id"
			+" AND DATA.SEX= :sex"
			,nativeQuery = true)
	          
	//public List<User> getContenido(@Param("id")String id );
	public UserResponse getContenido2(@Param("id")String id ,@Param("sex")String sex);
	
	@Query(value = "SELECT\r\n"
			+ "DATA.EMPLID,\r\n"
			+ "DATA.LAST_NAME APELLIDO_PATERNO,\r\n"
			+ "DATA.SECOND_LAST_NAME APELLIDO_MATERNO,\r\n"
			+ "DATA.FIRST_NAME NOMBRES,\r\n"
			+ "DATA.BIRTHDATE FECHA_NACIMIENTO,\r\n"
			+ "DATA.MAR_STATUS ESTADO_CIVIL,\r\n"
			+ "DATA.SEX GENERO \r\n"
			+ "FROM PS_PERSONAL_DATA DATA\r\n"	
			+"WHERE DATA.EMPLID =:#{#request.emplid}"
			+" AND DATA.SEX=:#{#request.sex}"
			
			,nativeQuery = true)
	          
	
	List<UserResponse>  getContenido3(@Param("request")UserRequest request);

	@Query(value = "SELECT\r\n"
			+"NATIONAL_ID_TYPE TIPO_DOCUMENTO,\r\n"
			+"NATIONAL_ID NUMERO_DOCUMENTO,\r\n"
			+"EMPLID FROM PS_PERS_NID \r\n"
			+"WHERE EMPLID =:#{#request.emplid}",nativeQuery = true)

	Documento  getContenido4(@Param("request")UserRequest request);
	
}
