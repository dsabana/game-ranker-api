package com.geekbaggio.gameranker.service;

import com.geekbaggio.gameranker.dao.GameDao;
import com.geekbaggio.gameranker.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GameService {

    @Autowired
    GameDao gameDao;
    public List<Game> getAllGames() {
        return gameDao.findAll();
    }

    public Optional<Game> getGameById(UUID id) {
        return gameDao.findById(id);
    }

    public Game addGame(Game game) {
        return gameDao.save(game);
    }

    public void deleteGame(UUID id) {
        gameDao.deleteById(id);
    }

    public Optional<Game> updateGameById(UUID id, Game game) {
        return gameDao.findById(id).map(item -> {
           item.setName(game.getName());
           item.setRank(game.getRank());
           return gameDao.save(item);
        });
    }
}
