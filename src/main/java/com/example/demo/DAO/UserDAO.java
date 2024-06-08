package com.example.demo.DAO;

import com.example.demo.Models.UserModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserDAO implements BaseDAO<UserModel>{
    private Map<Long, UserModel> userMap=new HashMap<>();

    @Override
    public UserModel save(UserModel userModel){
       return userMap.putIfAbsent(userModel.getId(),userModel);
    }
    @Override
    public UserModel findById(Long id){
        validateUser(id);
        return userMap.get(id);
    }

    @Override
    public UserModel update(UserModel userModel){
        validateUser(userModel.getId());
        return save(userModel);
    }

    @Override
    public void delete(Long id){
        validateUser(id);
        userMap.remove(id);
    }
    public void validateUser(Long id){
        Optional.ofNullable(userMap.get(id)).orElseThrow(()-> new RuntimeException("User Not Found"));
    }

    public Map<Long, UserModel> getAllUser(){
        return userMap;
    }
}
