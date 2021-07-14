package com.computergeek.springcontext.springcontextdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull(message = "User Name is required")
    @Size(min = 1)
    private String userName;

    @NotNull(message = "Password is required")
    @Size(min = 1)
    private String password;

    @Min(value = 18, message = "Age must be greater than or equal to 18")
    @Max(value = 60, message = "Age must be less than or equal to 60")
    @NotNull(message = "Age is required")
    private Integer age;

    private String country;
}
