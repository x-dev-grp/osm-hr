package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.contractDto;
import com.osmrh.rh.model.Contract;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RH/Contrtract")
public class ContractController extends BaseControllerImpl<Contract, contractDto, contractDto> {


    public ContractController(BaseService<Contract, contractDto, contractDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "contracts";
    }
}
