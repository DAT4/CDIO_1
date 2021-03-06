package data.memory;//package data.memory;

import data.IUserDAO;
import data.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoryUserDAO implements IUserDAO {

    HashMap<Integer,UserDTO> userHMap = new HashMap<Integer, UserDTO>();

    @Override
    public UserDTO getUser(int userID) {
        return userHMap.get(userID);
    }

    public void updateUser(UserDTO user) {
        UserDTO tempUser = user;
        userHMap.remove(user.getId());

        userHMap.put(tempUser.getId(),tempUser);
    }

    @Override
    public void createUser(UserDTO user) {
      userHMap.put(user.getId(),user);
    }

    @Override
    public void deleteUser(int userID) {
        userHMap.remove(userID);
    }

    @Override
    public ArrayList<UserDTO> getUserList() {
        ArrayList<UserDTO> list = new ArrayList<UserDTO>();

        for(int id : userHMap.keySet()){
           list.add(userHMap.get(id));
       }
        return list;
    }
}