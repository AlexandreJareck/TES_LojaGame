package br.edu.ctup.TES_LojaGame.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ctup.TES_LojaGame.model.Jogo;
import br.edu.ctup.TES_LojaGame.repository.JogoRepository;

@RestController
@RequestMapping("jogo")
public class JogoController {

	@Autowired
	private JogoRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Jogo> listAll(){
		Iterable<Jogo> list = repository.findAll();
		return list;		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Jogo getById(@PathVariable Integer id) {
		Jogo jogo = repository.getOne(id);
		return jogo;
	}
	
	@PostMapping
	public Jogo add(@RequestBody @Valid Jogo jogo) {
		return repository.save(jogo);
	}
	
	@DeleteMapping("/{id}")
	public Jogo delete(@PathVariable Integer id) {
		Jogo jogo = repository.getOne(id);
		repository.delete(jogo);
		return jogo;
		
	}
	
	@GetMapping("/titulo={titulo}")
	public @ResponseBody Iterable<Jogo> getAllByStatus(@PathVariable String titulo) {
		Iterable<Jogo> jogo = repository.getAllByTitle(titulo);
		return jogo;
	}
	
}
