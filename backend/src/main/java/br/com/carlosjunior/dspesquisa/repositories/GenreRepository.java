package br.com.carlosjunior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.dspesquisa.entities.Genre;


public interface GenreRepository extends JpaRepository<Genre, Long>{

}
