package com.example.employeeapi.model;

import javax.validation.constraints.*;

public class Skill {
    @NotNull @Min(1) private Integer id;
    @NotNull @NotBlank @Size(min=1, max=30) private String name;
    // getters/setters
}
