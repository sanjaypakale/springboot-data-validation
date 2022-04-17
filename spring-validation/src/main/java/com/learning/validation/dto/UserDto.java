package com.learning.validation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "userBuild")
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;
    @NotNull(message = "username should not be null")
    private String username;
    @Email(message = "Enter valid email address")
    private String email;
    @Max(value = 30, message = "Age should not be more than 30 years")
    @Min(value = 20, message = "Age should not be less than 20 years")
    private Integer age;
    private String address;
}
