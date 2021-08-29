package be.usermanagement.usermanagement.service;

import be.usermanagement.usermanagement.domain.User;
import be.usermanagement.usermanagement.exception.domain.EmailExistException;
import be.usermanagement.usermanagement.exception.domain.UserNotFoundException;
import be.usermanagement.usermanagement.exception.domain.UsernameExistException;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.List;

@Service
public interface UserService {
    User register(String firstname, String lastname, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

    List<User> getUser();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
