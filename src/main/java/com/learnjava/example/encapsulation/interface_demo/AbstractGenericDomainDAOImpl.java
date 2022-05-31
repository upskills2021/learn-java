package com.learnjava.example.encapsulation.interface_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractGenericDomainDAOImpl implements GenericDomainDAO{
    protected List<DomainEntity> entities = new ArrayList<>();
    @Override
    public void create(DomainEntity entity) {
        //implement logic to save user to db
        if(entity != null) {
            entities.add(entity);
        }
        System.out.println("User successfully created..");
    }

    @Override
    public DomainEntity findById(Long id) {
        return entities.stream()
                .filter(u -> Objects.equals(u.getId(), id))
                .findFirst()
                .orElse(null);
    }
}
