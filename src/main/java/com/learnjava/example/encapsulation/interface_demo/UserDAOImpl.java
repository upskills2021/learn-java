package com.learnjava.example.encapsulation.interface_demo;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserDAOImpl extends AbstractGenericDomainDAOImpl implements UserDAO {
    @Override
    public User findByUserId(String userId) {
        List<DomainEntity> domainEntities = super.entities;
        List<User> users = convertDomainEntitiesToUser(domainEntities);
        return users.stream()
                .filter(user -> Objects.equals(userId, user.getUserId()))
                .findFirst()
                .orElse(null);
    }

    private List<User> convertDomainEntitiesToUser(List<DomainEntity> domainEntities) {
        return domainEntities.stream()
                .map(entity -> (User) entity)
                .collect(Collectors.toList());
    }
}
