package edu.bj.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.bj.avaliacao.model.Projeto;
import edu.bj.avaliacao.repository.ProjetoRepository;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {
	@Autowired ProjetoRepository projetoRepository;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Projeto> find() {
		return projetoRepository.findAll();	
	}
				
}
