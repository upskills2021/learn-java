package com.learnjava.example.encapsulation.interface_demo;

public class UserDaoTest {

    public static void main(String[] args) {
        GenericDomainDAO userDAO = new UserDAOImpl();
        userDAO.create(UserTest.getUser());
        DomainEntity user = userDAO.findById(2l);
        if(user != null) {
            System.out.printf("Get User with user id {%s}%n", user.getId());
        }else {
            throw new UserNotFoundException(String.format("User Not found with userId :: {%s}", 1l));
        }
    }
}
