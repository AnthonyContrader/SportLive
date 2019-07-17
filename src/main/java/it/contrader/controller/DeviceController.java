package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.contrader.dto.LoginDTO;
import it.contrader.dto.DeviceDTO;
import it.contrader.service.DeviceService;

@RestController
@RequestMapping("/device")
@CrossOrigin(origins = "http://localhost:4200")
public class DeviceController extends AbstractController<DeviceDTO> {
	
	@Autowired
	private DeviceService deviceService;

	@PostMapping(value = "/login")
	public DeviceDTO login( @RequestBody LoginDTO loginDTO ) {
		return deviceService.findByIdplayer(loginDTO.getIdplayer());
	}
} 

