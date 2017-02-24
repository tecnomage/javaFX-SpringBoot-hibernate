package br.jus.PjeMonitor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.jus.PjeMonitor.model.Client;


@Repository
public interface ClienteRepo extends CrudRepository<Client,Integer> {

}
