/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.democrud.commons;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author frank
 */
public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericServiceAPI<T, ID> {
    
    @Override
    public T save(T entity) {
        return getDao().save(entity);
    }
    
    @Override
    public void delete(ID id) {
    }
    
    @Override
    public T get(ID id) {
        return null;
    }
    
    @Override
    public List<T> getAll() {
        return null;
    }
    
    public abstract CrudRepository<T, ID> getDao();
    
}
