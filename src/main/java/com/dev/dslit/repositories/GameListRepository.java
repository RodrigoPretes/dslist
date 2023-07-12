package com.dev.dslit.repositories;

import com.dev.dslit.entities.Game;
import com.dev.dslit.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
