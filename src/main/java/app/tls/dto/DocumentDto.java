package app.tls.dto;

import app.tls.model.Document;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDto {

    @JsonProperty("TIPO_DOCUMENTO")
    private String documentType;

    @JsonProperty("NUMERO_DOCUMENTO")
    private String documentNumber;

    @JsonProperty("EMPLID")
    private String emplid;

    public static DocumentDto fromDocumentModel(Document document) {
        return new DocumentDto(document.getDocumentType(), document.getDocumentNumber(), document.getEmplid());
    }
}
