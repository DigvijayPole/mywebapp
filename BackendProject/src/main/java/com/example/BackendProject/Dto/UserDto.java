package com.example.BackendProject.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String fname;
    private String lname;
    private String email;
    private long contactNo;
    private String gender;
}
