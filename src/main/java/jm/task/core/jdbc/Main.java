package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dim", "Yag", (byte)23);
        userService.saveUser("Sasha", "Meg", (byte)25);
        userService.saveUser("Ivan", "Ivanov", (byte)20);
        userService.saveUser("Alexandr", "Ser", (byte)33);
        List<User> list = userService.getAllUsers();
        for (User user : list) {
            System.out.println(user);
        }
        userService.removeUserById(3);
        List<User> listBeforeDelete = userService.getAllUsers();
        for (User user : listBeforeDelete) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}