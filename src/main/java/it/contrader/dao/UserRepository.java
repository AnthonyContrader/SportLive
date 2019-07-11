package it.contrader.dao;



import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.enumerators.UserType;
import it.contrader.model.User;



import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


public interface UserRepository extends CrudRepository<User, Integer> {


	public User findUserByUsernameAndPassword(String username,String password);

	public List<User> findAllByUsername(String username);
	
	@Query("SELECT user FROM User user WHERE user.usertype IN :ids")
	public List<User> findAllByUsertype(@Param("ids") List<UserType> usertype);
	
	
	
	
}