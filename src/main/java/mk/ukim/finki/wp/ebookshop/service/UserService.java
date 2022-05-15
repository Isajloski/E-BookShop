package mk.ukim.finki.wp.ebookshop.service;

import mk.ukim.finki.wp.ebookshop.exceptions.InvalidArgumentsException;
import mk.ukim.finki.wp.ebookshop.exceptions.InvalidUserCredentialsException;
import mk.ukim.finki.wp.ebookshop.exceptions.InvalidUsernameOrPasswordException;
import mk.ukim.finki.wp.ebookshop.model.User;
import mk.ukim.finki.wp.ebookshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User register (String username, String password, String email){
        if (username==null || username.isEmpty()  || password==null || password.isEmpty() || email == null || email.isEmpty())
            throw new InvalidUsernameOrPasswordException();
        if(this.userRepository.findByUsername(username).isPresent()||this.userRepository.findByPassword(password).isPresent())
            throw new InvalidUsernameOrPasswordException();
        User user = new User(username,password,email);
        return userRepository.save(user);

    }

    public User loginUser(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        User us = userRepository.findByUsernameAndPassword(username,password);
        return us;
    }




}

