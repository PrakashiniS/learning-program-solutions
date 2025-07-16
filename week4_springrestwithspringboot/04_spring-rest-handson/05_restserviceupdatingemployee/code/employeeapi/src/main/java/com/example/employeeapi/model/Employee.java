package com.example.employeeapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.*;
import java.util.*;

public class Employee {
    @NotNull @Min(1) private Integer id;
    @NotNull @NotBlank @Size(min=1, max=30) private String name;
    @NotNull @DecimalMin("0.0") private Double salary;
    @NotNull private Boolean permanent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    @Valid private Department department;
    @NotNull @Size(min = 1) @Valid private List<Skill> skills;
    // getters/setters
}