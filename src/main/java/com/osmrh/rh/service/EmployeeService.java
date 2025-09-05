package com.osmrh.rh.service;

import com.osmrh.rh.Dtos.EmployeeDto;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.models.Action;
import com.xdev.xdevbase.repos.BaseRepository;
import com.xdev.xdevbase.services.impl.BaseServiceImpl;
import com.xdev.xdevbase.utils.OSMLogger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeService extends BaseServiceImpl<Employee, EmployeeDto, EmployeeDto> {

    public EmployeeService(BaseRepository<Employee> repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }


    @Override
    public Set<Action> actionsMapping(Employee Employee) {
        long startTime = System.currentTimeMillis();
        OSMLogger.logMethodEntry(this.getClass(), "actionsMapping", Employee);
        Set<Action> actions = new HashSet<>();
        actions.add(Action.READ);
        actions.add(Action.UPDATE);
        actions.add(Action.DELETE);
        OSMLogger.logMethodExit(this.getClass(), "actionsMapping", actions);
        OSMLogger.logPerformance(this.getClass(), "actionsMapping", startTime, System.currentTimeMillis());
        return actions;
    }
}