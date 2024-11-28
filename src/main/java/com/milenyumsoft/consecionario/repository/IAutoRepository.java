package com.milenyumsoft.consecionario.repository;

import com.milenyumsoft.consecionario.model.Auto;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutoRepository extends JpaRepository<Auto, Long> {

}
