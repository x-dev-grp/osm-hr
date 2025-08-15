package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.DepartmentDto;
import com.osmrh.rh.model.Department;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr/Department")
public class DepartementController extends BaseControllerImpl<Department, DepartmentDto, DepartmentDto> {


    public DepartementController(BaseService<Department, DepartmentDto, DepartmentDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "department";
    }
}
