package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    public User getUserById(long id);

    void addUser(User user);

    public void removeUser(long id);

    void editUser(User user);
}