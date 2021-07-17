package br.com.carlosjunior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
