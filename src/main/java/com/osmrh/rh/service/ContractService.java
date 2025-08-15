package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.ContractDto;
import com.osmrh.rh.model.Contract;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ContractService extends BaseServiceImpl<Contract, ContractDto, ContractDto> {

    public ContractService(BaseRepository<Contract> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}