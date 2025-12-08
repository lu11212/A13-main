package com.example.db_setup.model.dto.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ChangePasswordRequestDTO {
    @NotBlank(message = "{UserRegistrationDTO.email.notblank}")
    @Email(message = "{UserRegistrationDTO.email.invalid}")
    private String email;
    private String passwordResetToken;
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
}
