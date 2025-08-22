package com.joseeneto19.dslist.controllers;

import com.joseeneto19.dslist.dto.GameListDTO;
import com.joseeneto19.dslist.dto.GameMiniDTO;
import com.joseeneto19.dslist.services.GameListService;
import com.joseeneto19.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private GameListService gameListService;

    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> dto = gameListService.findAll();
        return dto;
    }

    @GetMapping("/{listId}/games")
    public List<GameMiniDTO> findByList(@PathVariable Long listId) {
        List<GameMiniDTO> result = gameService.findByList(listId);
        return result;
    }

}
