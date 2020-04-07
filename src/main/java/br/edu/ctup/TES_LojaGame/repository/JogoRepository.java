package br.edu.ctup.TES_LojaGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ctup.TES_LojaGame.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Integer>{
	
	@Query(value ="SELECT * FROM JOGO WHERE Titulo =?1", nativeQuery = true)	
	List<Jogo> getAllByTitle(String titulo);

}
