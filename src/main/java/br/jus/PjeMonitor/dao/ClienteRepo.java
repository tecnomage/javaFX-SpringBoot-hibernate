package br.jus.PjeMonitor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.jus.PjeMonitor.model.Client;


@Repository
public interface ClienteRepo extends CrudRepository<Client,Integer> {

	
	@Query("Select c from Client c")
	public List<Client> findAllClients();
	
	
}
