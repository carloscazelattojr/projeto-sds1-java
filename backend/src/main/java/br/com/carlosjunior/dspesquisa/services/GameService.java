package br.com.carlosjunior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.carlosjunior.dspesquisa.dto.GameDTO;
import br.com.carlosjunior.dspesquisa.entities.Game;
import br.com.carlosjunior.dspesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> listGame = gameRepository.findAll();
		return listGame.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}

}
