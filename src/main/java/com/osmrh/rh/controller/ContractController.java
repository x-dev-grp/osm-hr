package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.ContractDto;
import com.osmrh.rh.model.Contract;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr/contract")
public class ContractController extends BaseControllerImpl<Contract, ContractDto, ContractDto> {


    public ContractController(BaseService<Contract, ContractDto, ContractDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "CONTRACT";
    }
}
