package com.example.demo.DAO;



public interface BaseDAO<T>{
    T save(T values);
    T findById(Long id);
    T update(T entity);
    void delete(Long id);


}
