package app.tls.dto;

import app.tls.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @JsonProperty("EMPLID")
    private String emplid;

    @JsonProperty("APELLIDO_PATERNO")
    private String lastName;

    @JsonProperty("APELLIDO_MATERNO")
    private String secondLastName;

    @JsonProperty("NOMBRES")
    private String firstName;

    @JsonProperty("FECHA_DE_NACIMIENTO")
    private String dateOfBirth;

    @JsonProperty("ESTADO_CIVIL")
    private String maritalStatus;

    @JsonProperty("GENERO")
    private String gender;

    @JsonProperty("DOCUMENTOS")
    private DocumentDto document;

    public static UserDto fromUserModel(User user) {
        return new UserDto(
                user.getEmplid(),
                user.getLastName(),
                user.getSecondLastName(),
                user.getFirstName(),
                user.getDateOfBirth(),
                user.getMaritalStatus(),
                user.getGender(),
                null);
    }

    public static UserDto fromUserModelWithDocument(User user) {
        return new UserDto(
                user.getEmplid(),
                user.getLastName(),
                user.getSecondLastName(),
                user.getFirstName(),
                user.getDateOfBirth(),
                user.getMaritalStatus(),
                user.getGender(),
                DocumentDto.fromDocumentModel(user.getDocument()));
    }
}
