package com.milenyumsoft.consecionario.repository;

import com.milenyumsoft.consecionario.model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario, Long> {
}
