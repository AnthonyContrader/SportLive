package it.contrader.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.UserRepository;

@Service
public class PrimeService {

	private final UserRepository userRepository;
	
	@Autowired
	public PrimeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
