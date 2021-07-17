package br.com.carlosjunior.dspesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosjunior.dspesquisa.dto.RecordDTO;
import br.com.carlosjunior.dspesquisa.dto.RecordInsertDTO;
import br.com.carlosjunior.dspesquisa.services.RecordService;

@RestController
@RequestMapping("/records")
public class RecordController {
	
	@Autowired
	private RecordService recordService;
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = recordService.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
	
}
