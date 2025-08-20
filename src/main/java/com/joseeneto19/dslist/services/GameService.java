package com.joseeneto19.dslist.services;

import com.joseeneto19.dslist.dto.GameDTO;
import com.joseeneto19.dslist.dto.GameMiniDTO;
import com.joseeneto19.dslist.entities.Game;
import com.joseeneto19.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMiniDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMiniDTO(x)).toList();
    }

}
