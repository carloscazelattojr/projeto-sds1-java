package br.com.carlosjunior.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.carlosjunior.dspesquisa.dto.RecordDTO;
import br.com.carlosjunior.dspesquisa.dto.RecordInsertDTO;
import br.com.carlosjunior.dspesquisa.entities.Game;
import br.com.carlosjunior.dspesquisa.entities.Record;
import br.com.carlosjunior.dspesquisa.repositories.GameRepository;
import br.com.carlosjunior.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto ) {
		
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getById(dto.getGameId());
		entity.setGame(game);
		
		entity = recordRepository.save(entity);
		return new RecordDTO(entity);		
	}


	
}
