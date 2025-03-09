package user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void updateUser(Integer id, String data) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                user.setUserName(data);
            }
        }
    }

    public void deleteUser(Integer id) {
        userList.removeIf(user -> user.getId().equals(id));
    }
}