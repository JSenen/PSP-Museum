package com.juansenen.Museum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departments {

    private List<Departments> departments;
    private int departmentId;
    private String displayName;


}
