package com.example.db_setup.model.dto.auth;

import com.example.db_setup.model.Studies;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
public class UserRegistrationDTO {

    @NotBlank(message = "{UserRegistrationDTO.name.notblank}")
    @Size(min = 2, max = 30, message = "{UserRegistrationDTO.name.size}")
    @Pattern(
            regexp = "[a-zA-Z]([a-zA-Z']*[a-zA-Z])?([-\\s][a-zA-Z]([a-zA-Z']*[a-zA-Z])?)*",
            message = "{UserRegistrationDTO.name.pattern}"
    )
    private String name;

    @NotBlank(message = "{UserRegistrationDTO.surname.notblank}")
    @Size(min = 2, max = 30, message = "{UserRegistrationDTO.surname.size}")
    @Pattern(
            regexp = "[a-zA-Z]([a-zA-Z']*[a-zA-Z])?([-\\s][a-zA-Z]([a-zA-Z']*[a-zA-Z])?)*",
            message = "{UserRegistrationDTO.surname.pattern}"
    )
    private String surname;

    @NotBlank(message = "{UserRegistrationDTO.email.notblank}")
    @Email(message = "{UserRegistrationDTO.email.invalid}")
    private String email;

    @NotBlank(message = "{UserRegistrationDTO.password.notblank}")
    @Size(min = 8, max = 16, message = "{UserRegistrationDTO.password.size}")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,16}$",
            message = "{UserRegistrationDTO.password.pattern}"
    )
    private String password;

    @NotBlank(message = "{UserRegistrationDTO.passwordCheck.notblank}")
    @Size(min = 8, max = 16, message = "{UserRegistrationDTO.passwordCheck.size}")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,16}$",
            message = "{UserRegistrationDTO.passwordCheck.pattern}"
    )
    private String passwordCheck;

    @NotNull(message = "{UserRegistrationDTO.studies.notnull}")
    private Studies studies;
}
