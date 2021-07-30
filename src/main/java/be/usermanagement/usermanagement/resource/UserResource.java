package be.usermanagement.usermanagement.resource;

import be.usermanagement.usermanagement.domain.User;
import be.usermanagement.usermanagement.exception.domain.EmailNotFoundException;
import be.usermanagement.usermanagement.exception.domain.ExceptionHandling;
import be.usermanagement.usermanagement.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() throws UserNotFoundException {
//        return "application works";
        throw new UserNotFoundException("user not found");

    }
}
