package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.DepartementDto;
import com.osmrh.rh.Dtos.PointageDto;
import com.osmrh.rh.model.Department;
import com.osmrh.rh.model.Pointage;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RH/Departement")
public class DepartementController extends BaseControllerImpl<Department, DepartementDto, DepartementDto> {


    public DepartementController(BaseService<Department, DepartementDto, DepartementDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "pointage";
    }
}
