package app.tls.model.response;

import app.tls.model.Documento;

import javax.persistence.*;

@Entity

//@Table(name = "PS_PERSONAL_DATA")
public class UserResponse {
	
	@Id
	@Column(name = "EMPLID")
	private String emplid;

	@Column(name = "APELLIDO_PATERNO")
	private String last_name;

	@Column(name = "APELLIDO_MATERNO")
	private String second_last_name;

	@Column(name = "NOMBRES")
	private String first_name;

	@Column(name = "FECHA_NACIMIENTO")
	private String birthdate;

	@Column(name = "ESTADO_CIVIL")
	private String mar_status;

	@Column(name = "GENERO")
	private String sex;

	public Documento getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documento documentos) {
		this.documentos = documentos;
	}

	@Transient
	private Documento documentos;
	
	

	public UserResponse(String emplid, String last_name, String second_last_name, String first_name, String birthdate,
			String mar_status, String sex) {
		super();
		this.emplid = emplid;
		this.last_name = last_name;
		this.second_last_name = second_last_name;
		this.first_name = first_name;
		this.birthdate = birthdate;
		this.mar_status = mar_status;
		this.sex = sex;
	}

	public UserResponse() {
		super();
	}

	public String getEmplid() {
		return emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSecond_last_name() {
		return second_last_name;
	}

	public void setSecond_last_name(String second_last_name) {
		this.second_last_name = second_last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getMar_status() {
		return mar_status;
	}

	public void setMar_status(String mar_status) {
		this.mar_status = mar_status;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserResponse [emplid=" + emplid + ", last_name=" + last_name + ", second_last_name=" + second_last_name
				+ ", first_name=" + first_name + ", birthdate=" + birthdate + ", mar_status=" + mar_status + ", sex="
				+ sex + "]";
	}
	
	
	

	
	

		

		
		

		
}
