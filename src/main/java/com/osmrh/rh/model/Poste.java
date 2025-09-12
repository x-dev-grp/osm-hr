package com.osmrh.rh.model;

import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "postes")
public class Poste extends BaseEntity implements Serializable {
    private String name;
    private String description;
    // Poste is referenced by many Contracts
    @OneToMany(mappedBy = "poste")
    private List<Contract> contracts = new ArrayList<>();

    public List<Contract> getContracts() { return contracts; }
    public void setContracts(List<Contract> contracts) {
        this.contracts = (contracts != null) ? contracts : new ArrayList<>();
    }
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

