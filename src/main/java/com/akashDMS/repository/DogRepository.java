package com.akashDMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.akashDMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
	
}
