package br.edu.ctup.TES_LojaGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ctup.TES_LojaGame.model.Cliente;
import br.edu.ctup.TES_LojaGame.model.Jogo;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Query(value ="SELECT * FROM CLIENTE WHERE Nome =?1", nativeQuery = true)	
	List<Cliente> getAllByName(String nome);
	
}
