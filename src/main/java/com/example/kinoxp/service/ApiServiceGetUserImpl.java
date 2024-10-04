package com.example.kinoxp.service;

import com.example.kinoxp.model.User;
import com.example.kinoxp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceGetUserImpl implements ApiServiceGetUser {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
/*
    @Autowired
    private final RestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;
    String userUrl = "http://localhost:8080/users";

    public ApiServiceGetUserImpl(RestTemplate restTemplate, UserRepository userRepository) {
        this.restTemplate = restTemplate;
    }
    public void saveUser(List<User> users){
        users.forEach(user -> userRepository.save(user));
    }

    @Override
    public List<User> getUsers() {
        List<User> lst = new ArrayList<>();
        ResponseEntity<List<User>> userResponse =
                restTemplate.exchange(userUrl,
                        HttpMethod.GET, null, new      ParameterizedTypeReference<List<User>>(){
                        });
        List<User> userList = userResponse.getBody();
        saveUser(userList);
        return userList;
    }
*/
}
