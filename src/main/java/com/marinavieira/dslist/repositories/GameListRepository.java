package com.marinavieira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marinavieira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{



    
}
