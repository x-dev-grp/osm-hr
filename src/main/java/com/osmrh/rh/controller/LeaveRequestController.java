package com.osmrh.rh.controller;

import com.osmrh.rh.Dtos.LeaveRequestDto;
import com.osmrh.rh.model.LeaveRequest;
import com.xdev.xdevbase.controllers.impl.BaseControllerImpl;
import com.xdev.xdevbase.services.BaseService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RH/LeaveRequest")
public class LeaveRequestController extends BaseControllerImpl<LeaveRequest, LeaveRequestDto, LeaveRequestDto> {


    public LeaveRequestController(BaseService<LeaveRequest,LeaveRequestDto, LeaveRequestDto> baseService, ModelMapper modelMapper) {
        super(baseService, modelMapper);
    }

    @Override
    protected String getResourceName() {
        return "LeaveRequest";
    }
}
