package it.contrader.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.contrader.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
