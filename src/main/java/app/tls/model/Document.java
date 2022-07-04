package app.tls.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "PS_PERS_NID")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Document {

    @Id
    @Column(name = "TIPO_DOCUMENTO")
    private String documentType;

    @Column(name = "NUMERO_DOCUMENTO")
    private String documentNumber;

    @Column(name = "EMPLID")
    private String emplid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Document document = (Document) o;
        return documentType != null && Objects.equals(documentType, document.documentType);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
