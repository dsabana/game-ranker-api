package com.geekbaggio.gameranker.controller;

import com.geekbaggio.gameranker.models.Game;
import com.geekbaggio.gameranker.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("games")
public class GameController {

    @Autowired
    GameService questionService;

    @GetMapping
    public ResponseEntity<List<Game>> getAllGames() {
        return new ResponseEntity<>(questionService.getAllGames(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Game> getGameById(@PathVariable UUID id) {
        return new ResponseEntity<>(questionService.getGameById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Game> addGame(@RequestBody Game game) {
        return new ResponseEntity<>(questionService.addGame(game), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable UUID id) {
        questionService.deleteGame(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<Game> updateGameById(@PathVariable UUID id, @RequestBody Game game) {
        return new ResponseEntity<>(questionService.updateGameById(id, game).orElse(null), HttpStatus.OK);
    }
}