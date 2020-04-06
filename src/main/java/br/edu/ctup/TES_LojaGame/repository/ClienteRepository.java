package br.edu.ctup.TES_LojaGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ctup.TES_LojaGame.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
