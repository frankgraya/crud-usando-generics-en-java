/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.democrud.dao.api;

import com.example.democrud.model.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author frank
 */
public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
