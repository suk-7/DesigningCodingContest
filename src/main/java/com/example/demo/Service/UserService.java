package com.example.demo.Service;

import com.example.demo.DAO.UserDAO;
import com.example.demo.Models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDao;
    public UserModel create(UserModel user){
        user.setScore(20);
       // userDao.save(user);
        return null;
    }
}
