package be.usermanagement.usermanagement.resource;

import be.usermanagement.usermanagement.domain.User;
import be.usermanagement.usermanagement.exception.domain.*;
import be.usermanagement.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserResource extends ExceptionHandling {

    private UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user)
            throws UserNotFoundException, UsernameExistException, EmailExistException {
        User newUser = userService.register(user.getFirstname(), user.getLastname(), user.getUsername(), user.getEmail());
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
