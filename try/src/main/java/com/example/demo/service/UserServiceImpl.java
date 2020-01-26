package com.example.demo.service;

import com.example.demo.exeption.NoResourceException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if(optionalUser.isPresent()) {
            return optionalUser.get();
        }

       throw new NoResourceException("No resource!");
    }

    @Override
    public List<User> findByStatus(Integer status) {
        List<User> users = userRepository.findByStatus(status);

        if(!CollectionUtils.isEmpty(users)) {
            return users;
        }

        throw new NoResourceException("No resource!");
    }

    @Override
    public Boolean addNewUser(String name, String email, String password, Integer status) {
        Boolean bool = userRepository.addNewUser(name, email, password, status);
        return bool;
    }


    /*
    public User findById(int id) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return list.get(i);
            }
        }
        return null;
    }

    public User findByStatus(int id) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getStatus() == id){
                return list.get(i);
            }
        }
        return null;
    } */
}
