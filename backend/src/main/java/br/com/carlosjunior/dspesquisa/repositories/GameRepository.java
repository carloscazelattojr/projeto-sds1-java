package br.com.carlosjunior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.dspesquisa.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}
