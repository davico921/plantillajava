package app.tls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Documento {

    public String getTIPO_DOCUMENTO() {
        return TIPO_DOCUMENTO;
    }

    public void setTIPO_DOCUMENTO(String TIPO_DOCUMENTO) {
        this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
    }

    public String getNUMERO_DOCUMENTO() {
        return NUMERO_DOCUMENTO;
    }

    public void setNUMERO_DOCUMENTO(String NUMERO_DOCUMENTO) {
        this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
    }

    public String getEMPLID() {
        return EMPLID;
    }

    public void setEMPLID(String EMPLID) {
        this.EMPLID = EMPLID;
    }

    @Id
    @Column(name = "TIPO_DOCUMENTO")
    private String TIPO_DOCUMENTO;
    @Column(name = "NUMERO_DOCUMENTO")
    private String NUMERO_DOCUMENTO;
    @Column(name = "EMPLID")
    private String EMPLID;

}
