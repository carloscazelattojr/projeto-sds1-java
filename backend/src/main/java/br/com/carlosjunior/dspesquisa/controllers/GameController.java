package br.com.carlosjunior.dspesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosjunior.dspesquisa.dto.GameDTO;
import br.com.carlosjunior.dspesquisa.entities.Game;
import br.com.carlosjunior.dspesquisa.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		List<GameDTO> listGame = gameService.findAll();
		return ResponseEntity.ok().body(listGame);
	}

}
