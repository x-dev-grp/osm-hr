package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.EmployeeDto;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseServiceImpl<Employee, EmployeeDto, EmployeeDto> {

    public EmployeeService(BaseRepository<Employee> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}