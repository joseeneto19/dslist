package com.joseeneto19.dslist.services;

import com.joseeneto19.dslist.dto.GameMiniDTO;
import com.joseeneto19.dslist.entities.Game;
import com.joseeneto19.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMiniDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMiniDTO(x)).toList();
    }

}
