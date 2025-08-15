package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.DepartmentDto;
import com.osmrh.rh.model.Department;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class departementService extends BaseServiceImpl<Department, DepartmentDto, DepartmentDto> {

    public departementService(BaseRepository<Department> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}