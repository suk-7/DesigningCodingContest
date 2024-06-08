package com.example.demo.Service;

import com.example.demo.DAO.UserDAO;
import com.example.demo.Models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDao;
    public UserModel createUser(UserModel user){
        user.setScore(20);
        return userDao.save(user);
    }
    public UserModel attendContest(UserModel user){
        return null;
    }
}
