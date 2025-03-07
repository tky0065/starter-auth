package com.enokdev.spring_boot_starter_auth.dtos;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    @NotEmpty

    private String username;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    private String firstName;


    private String lastName;
}
