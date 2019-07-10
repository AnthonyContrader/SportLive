
package it.contrader.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ParametersDTO {

	private Integer id;

	@NonNull
	private Integer idPlayer;

	@NonNull
	private Timestamp data;

	@NonNull
	private Integer age;

	@NonNull
	private Integer height;

	@NonNull
	private Integer weight;

	@NonNull
	private Integer gol;

	@NonNull
	private Integer gp;

	@NonNull
	private Integer mp;
}
