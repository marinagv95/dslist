package com.marinavieira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marinavieira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{



    
}
