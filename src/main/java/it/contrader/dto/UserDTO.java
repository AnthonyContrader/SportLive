package it.contrader.dto;

import it.contrader.enumerators.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDTO {

	
	private int id;

	@NonNull
	private String username;
	
	@NonNull
	private String password;

	@NonNull
	private UserType usertype;

	@NonNull
	private String name;

	@NonNull
	private String surname;

}
