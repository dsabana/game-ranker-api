package com.geekbaggio.gameranker.dao;

import com.geekbaggio.gameranker.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GameDao extends JpaRepository<Game, UUID> {
}
