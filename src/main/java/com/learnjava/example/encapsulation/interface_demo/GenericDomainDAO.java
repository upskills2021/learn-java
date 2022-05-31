package com.learnjava.example.encapsulation.interface_demo;

public interface GenericDomainDAO {
    void create(DomainEntity entity);
    DomainEntity findById(Long id);
}
