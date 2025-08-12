package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.PayRollsDto;
import com.osmrh.rh.model.PayRolls;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PayRollsService extends BaseServiceImpl<PayRolls, PayRollsDto, PayRollsDto> {

    public PayRollsService(BaseRepository<PayRolls> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}