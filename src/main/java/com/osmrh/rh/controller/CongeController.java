package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.CongeDto;
import com.osmrh.rh.model.Conge;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr/Conge")
public class CongeController extends BaseControllerImpl<Conge, CongeDto,CongeDto> {


    public CongeController(BaseService<Conge,CongeDto, CongeDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "conge";
    }
}
