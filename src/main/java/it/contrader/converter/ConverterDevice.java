package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.DeviceDTO;
import it.contrader.model.Device;

public class ConverterDevice {

	public static DeviceDTO toDTO(Device device) {
		DeviceDTO deviceDTO = null;
		if (device != null) {
			deviceDTO = new DeviceDTO();
			deviceDTO.setIdPlayer(device.getIdPlayer());
			deviceDTO.setHeartbeat(device.getHeartbeat());
			deviceDTO.setPressure(device.getPressure());
			deviceDTO.setBreath(device.getBreath());
//device aggiornato
		}
		return deviceDTO;
	}
	
	
	public static Device toEntity(DeviceDTO deviceDTO) {
		Device device = null;
		if(deviceDTO != null) {
			device = new Device();
			device.setIdPlayer(deviceDTO.getIdPlayer());
			device.setHeartbeat(deviceDTO.getHeartbeat());
			device.setPressure(deviceDTO.getPressure());
			device.setBreath(deviceDTO.getBreath());

		}
		return device;
	}
	
	public static List<DeviceDTO> toListDTO(List<Device> list){
		List<DeviceDTO> listDeviceDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Device device: list) {
				listDeviceDTO.add(ConverterDevice.toDTO(device));
			}
		}
		return listDeviceDTO;
	}
	
	public static List<Device> toListEntity(List<DeviceDTO> listDeviceDTO) {
		List<Device> list = new ArrayList<>();
		if (!listDeviceDTO.isEmpty()) {
			for (DeviceDTO deviceDTO : listDeviceDTO) {
				list.add(ConverterDevice.toEntity(deviceDTO));
			}
		}
		return list;
	}
}


