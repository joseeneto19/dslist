package com.joseeneto19.dslist.repositories;

import com.joseeneto19.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
