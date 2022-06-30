package app.tls.model.request;

import javax.persistence.Column;

public class UserRequest {
	
	private String emplid;
	private String sex;
	
	
	
	public UserRequest(String emplid, String sex) {
		super();
		this.emplid = emplid;
		this.sex = sex;
	}
	public String getEmplid() {
		return emplid;
	}
	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "UserRequest [emplid=" + emplid + ", sex=" + sex + "]";
	}

	
	
	

}
