package com.dev.dslit.services;


import com.dev.dslit.dto.GameMinDTO;
import com.dev.dslit.entities.Game;
import com.dev.dslit.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map( x-> new GameMinDTO(x)).toList();
        return dto;
    }
}
