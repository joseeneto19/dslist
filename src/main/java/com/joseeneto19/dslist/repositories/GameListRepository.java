package com.joseeneto19.dslist.repositories;

import com.joseeneto19.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
