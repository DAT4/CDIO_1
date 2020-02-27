package data;

import data.memory.UserDAO;

import java.util.List;

public interface IUserDAO{
    UserDTO getUser(int userID);
    void updateUser(UserDTO user);
    void createUser(UserDTO user);
    void deleteUser(int userID);
    List<UserDTO> getUserList();
}