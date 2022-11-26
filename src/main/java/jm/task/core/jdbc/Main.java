package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Dima", "German", (byte) 22);
        userService.saveUser("Petya", "Alexandrov", (byte) 23);
        userService.saveUser("Alexandr", "Petrovich", (byte) 31);
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
