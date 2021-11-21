package by.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserDTO {

    @NotBlank(message = "Error")
    @Size(min = 3,max = 16)
    private String username;

    @NotBlank(message = "Error")
    @Size(min = 3,max = 16)
    private String password;

}
