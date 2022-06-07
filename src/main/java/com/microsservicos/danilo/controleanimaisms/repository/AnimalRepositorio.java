package com.microsservicos.danilo.controleanimaisms.repository;

import com.microsservicos.danilo.controleanimaisms.model.Animal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalRepositorio extends JpaRepository<Animal, Integer> {

	List<Animal> findByDono(Integer dono);
    
}
