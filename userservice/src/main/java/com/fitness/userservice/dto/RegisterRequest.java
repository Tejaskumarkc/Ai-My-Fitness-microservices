package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is requried")
    @Email(message="Invalid email formate")
    private String email;

    @NotBlank(message = "Password is requried")
    @Size(min = 6, message = "Password must be more than 6 Characters")
    private  String password;

    private String keycloakId;

    private String firstName;
    private String lastName;

}
