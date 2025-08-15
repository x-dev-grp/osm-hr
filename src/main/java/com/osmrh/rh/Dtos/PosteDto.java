package com.osmrh.rh.Dtos;

import com.osmrh.rh.model.Poste;
import com.xdev.xdevbase.dtos.BaseDto;

public class PosteDto extends BaseDto<Poste> {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
