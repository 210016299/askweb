/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.services;

import com.kabaso.askweb.domain.Person;
import java.util.List;

/**
 *
 * @author hashcode
 */
public interface PeopleAgeService {

    public List<Person> getAgeAbove(int i);

    public List<Person> findAll();
    
}
