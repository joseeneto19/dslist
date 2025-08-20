package com.joseeneto19.dslist.controllers;

import com.joseeneto19.dslist.dto.GameDTO;
import com.joseeneto19.dslist.dto.GameMiniDTO;
import com.joseeneto19.dslist.entities.Game;
import com.joseeneto19.dslist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMiniDTO> findAll() {
        List<GameMiniDTO> dto = gameService.findAll();
        return dto;
    }

}
