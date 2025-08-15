package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.EmployeeDto;
import com.osmrh.rh.Dtos.PayRollsDto;
import com.osmrh.rh.model.Employee;
import com.osmrh.rh.model.PayRolls;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr/PayRolls")
public class PayRollsController extends BaseControllerImpl<PayRolls, PayRollsDto, PayRollsDto> {


    public PayRollsController(BaseService<PayRolls, PayRollsDto, PayRollsDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "PayRolls";
    }
}
