package com.dev.dslit.services;


import com.dev.dslit.dto.GameDTO;
import com.dev.dslit.dto.GameListDTO;
import com.dev.dslit.dto.GameMinDTO;
import com.dev.dslit.entities.Game;
import com.dev.dslit.entities.GameList;
import com.dev.dslit.repositories.GameListRepository;
import com.dev.dslit.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map( x-> new GameListDTO(x)).toList();
        return dto;
    }
}
