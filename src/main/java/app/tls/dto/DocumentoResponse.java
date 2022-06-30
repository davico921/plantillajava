package app.tls.dto;


//@Table(name = "PS_PERSONAL_DATA")
public class DocumentoResponse {


    private String emplid;


    private String last_name;


    private String second_last_name;


    private String first_name;


    private String birthdate;


    private String mar_status;


    private String sex;


    public DocumentoResponse() {
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


}



