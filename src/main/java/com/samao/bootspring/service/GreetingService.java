package com.samao.bootspring.service;

import com.samao.bootspring.model.Greeting;

import java.util.Collection;

/**
 * Created by samao on 12/27/15.
 */
public interface GreetingService {

    Collection<Greeting> findAll();

    Greeting findOne(Long id);

    Greeting create(Greeting greeting);

    Greeting update(Greeting greeting);

    void delete(Long id);
}
