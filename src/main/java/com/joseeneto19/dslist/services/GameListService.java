package com.joseeneto19.dslist.services;

import com.joseeneto19.dslist.dto.GameListDTO;
import com.joseeneto19.dslist.entities.GameList;
import com.joseeneto19.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x-> new GameListDTO(x)).toList();
    }

}
