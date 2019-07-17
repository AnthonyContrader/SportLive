package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Player;

@Repository
@Transactional
public interface PlayerRepository extends CrudRepository<Player, Long> {

	Player findByPlayername(String playername);
	
	Player findByPlayernameAndPassword(String playername, String password);
	
}
