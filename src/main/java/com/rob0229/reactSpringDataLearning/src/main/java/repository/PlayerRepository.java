package com.rob0229.reactSpringDataLearning.src.main.java.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rob0229.reactSpringDataLearning.src.main.java.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
