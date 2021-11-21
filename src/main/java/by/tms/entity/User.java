package by.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data @AllArgsConstructor @NoArgsConstructor
public class User {
    private long id;

    @NotBlank(message = "Error")
    @Size(min = 3,max = 16)
    private String name;

    @NotBlank(message = "Error")
    @Size(min = 3,max = 16)
    private String username;

    @NotBlank(message = "Error")
    @Size(min = 3,max = 16)
    private String password;
}
