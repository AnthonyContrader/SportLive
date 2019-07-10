package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class DeviceDTO {

	private Integer id;
	@NonNull
	private Integer idPlayer;

	@NonNull
	private String heartbeat;

	@NonNull
	private String pressure;

	@NonNull
	private String breath;

}
