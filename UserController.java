package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}/{userName}")
    public void addUser(@PathVariable Integer id, @PathVariable String userName) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        userService.addUser(user);
    }

    @PostMapping("/{id}/{data}")
    public void updateUser(@PathVariable Integer id, @PathVariable String data) {
        userService.updateUser(id, data);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}