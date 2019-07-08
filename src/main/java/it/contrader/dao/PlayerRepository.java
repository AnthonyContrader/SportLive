package it.contrader.dao;

import org.springframework.data.repository.CrudRepository;

import it.contrader.model.Player;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Integer>{

	public Player findPlayerByNicknameAndPassword(String nickname,String password);
	public List<Player> findAllByNickname(String nickname);
}
