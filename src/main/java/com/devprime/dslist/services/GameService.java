package com.devprime.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devprime.dslist.dto.GameMinDTO;
import com.devprime.dslist.entities.Game;
import com.devprime.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired 
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
