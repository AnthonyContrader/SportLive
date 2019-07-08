package it.contrader.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterDevice;
import it.contrader.dao.DeviceRepository;
import it.contrader.dto.DeviceDTO;
import it.contrader.model.Device;

@Service
public class DeviceService {

	@Autowired
	private DeviceRepository deviceRepository;

	

	public List<DeviceDTO> getListaDeviceDTO() {
		return ConverterDevice.toListDTO((List<Device>) deviceRepository.findAll());
	}

	public DeviceDTO getDeviceDTOByIdPlayer(Integer idPlayer) {
		return ConverterDevice.toDTO(deviceRepository.findByIdPlayer(idPlayer).get(idPlayer));
	}

	public DeviceDTO getByIdPlayer(Integer idPlayer) {

		final Device device = deviceRepository.findDeviceByIdPlayer(idPlayer);

		return ConverterDevice.toDTO(device);
	}

	public boolean insertDevice(DeviceDTO deviceDTO) {
		return deviceRepository.save(ConverterDevice.toEntity(deviceDTO)) != null;
	}

	public boolean updateDevice(DeviceDTO deviceDTO) {
		return deviceRepository.save(ConverterDevice.toEntity(deviceDTO)) != null;
	}
	
	public void deleteDeviceById(Integer idPlayer) {
		deviceRepository.deleteById(idPlayer);
	}
	
	public List<DeviceDTO> findDeviceDTOByIdPlayer(Integer idPlayer) {
		
		final List<Device> list = deviceRepository.findAllByIdPlayer(idPlayer);
		final List<DeviceDTO> deviceDTOs = new ArrayList<>();
		list.forEach(i -> deviceDTOs.add(ConverterDevice.toDTO(i)));
		return deviceDTOs;
		
	
	}

}
