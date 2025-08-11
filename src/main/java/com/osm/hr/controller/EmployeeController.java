package com.osm.hr.controller;

import com.osm.hr.Dtos.EmployeeDto;
import com.osm.hr.model.Employee;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr/Employees")
public class EmployeeController extends BaseControllerImpl<Employee, EmployeeDto, EmployeeDto> {


    public EmployeeController(BaseService<Employee, EmployeeDto, EmployeeDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "employee";
    }
}
