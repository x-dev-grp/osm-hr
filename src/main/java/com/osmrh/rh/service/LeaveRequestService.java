package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.LeaveRequestDto;
import com.osmrh.rh.model.LeaveRequest;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LeaveRequestService extends BaseServiceImpl<LeaveRequest, LeaveRequestDto, LeaveRequestDto> {

    public LeaveRequestService(BaseRepository<LeaveRequest> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}