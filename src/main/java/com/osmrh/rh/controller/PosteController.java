package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.DepartmentDto;
import com.osmrh.rh.Dtos.PosteDto;
import com.osmrh.rh.model.Poste;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr/poste")
public class PosteController extends BaseControllerImpl<Poste, PosteDto ,PosteDto> {


    public PosteController(BaseService<Poste, PosteDto, PosteDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "POSTE";
    }
}
