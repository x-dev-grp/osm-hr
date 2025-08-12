package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.PointageDto;
import com.osmrh.rh.model.Pointage;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RH/Pointage")
public class PointageController extends BaseControllerImpl<Pointage, PointageDto, PointageDto> {


    public PointageController(BaseService<Pointage, PointageDto, PointageDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "pointage";
    }
}
