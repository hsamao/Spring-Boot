package com.samao.bootspring.repository;

import com.samao.bootspring.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by samao on 12/28/15.
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
