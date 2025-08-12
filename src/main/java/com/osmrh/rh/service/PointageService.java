package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.PointageDto;
import com.osmrh.rh.model.Pointage;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PointageService extends BaseServiceImpl<Pointage, PointageDto, PointageDto> {

    public PointageService(BaseRepository<Pointage> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}