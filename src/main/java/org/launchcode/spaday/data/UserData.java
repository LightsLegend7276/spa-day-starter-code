package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    public static Map<Integer, User> users = new HashMap<>();

    // add user
    public static void addUser(User user) {
        users.put(user.getId(), user);
    }


    // getAllUsers
    public static Collection<User> getAll() {
        return users.values();
    }


    //getUserById
    public static User getUserById(int id) {
        return users.get(id);
    }

}
