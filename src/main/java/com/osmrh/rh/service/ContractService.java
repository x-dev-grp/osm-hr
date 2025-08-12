package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.EmployeeDto;
import com.osmrh.rh.Dtos.contractDto;
import com.osmrh.rh.model.Contract;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ContractService extends BaseServiceImpl<Contract, contractDto, contractDto> {

    public ContractService(BaseRepository<Contract> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}