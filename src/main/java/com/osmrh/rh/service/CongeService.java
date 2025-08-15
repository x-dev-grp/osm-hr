package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.CongeDto;
import com.osmrh.rh.model.Conge;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CongeService extends BaseServiceImpl<Conge, CongeDto,CongeDto> {

    public CongeService(BaseRepository<Conge> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }



}