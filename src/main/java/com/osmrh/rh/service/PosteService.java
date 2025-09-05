package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.DepartmentDto;
import com.osmrh.rh.Dtos.PosteDto;
import com.osmrh.rh.model.Department;
import com.osmrh.rh.model.Poste;
import com.xdev.xdevbase.models.Action;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import com.xdev.xdevbase.utils.OSMLogger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PosteService extends BaseServiceImpl<Poste, PosteDto, PosteDto> {

    public PosteService(BaseRepository<Poste> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);


    }
    @Override
    public Set<Action> actionsMapping(Poste Poste) {
        long startTime = System.currentTimeMillis();
        OSMLogger.logMethodEntry(this.getClass(), "actionsMapping",Poste);
        Set<Action> actions = new HashSet<>();
        actions.add(Action.UPDATE);
        actions.add(Action.DELETE);
        OSMLogger.logMethodExit(this.getClass(), "actionsMapping", actions);
        OSMLogger.logPerformance(this.getClass(), "actionsMapping", startTime, System.currentTimeMillis());
        return actions;
    }




}