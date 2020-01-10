package edu.bj.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.bj.avaliacao.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
	
}