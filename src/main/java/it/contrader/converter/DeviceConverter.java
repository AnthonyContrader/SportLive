package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.DeviceDTO;
import it.contrader.model.Device;

public class DeviceConverter  implements Converter<Device, DeviceDTO>  {

	
	@Override
	public DeviceDTO toDTO(Device device) {
		DeviceDTO deviceDTO = new DeviceDTO(device.getIdplayer(), device.getHeartbeat(), device.getPressure(), device.getBreath());
		return deviceDTO;
	}

	
	@Override
	public Device toEntity(DeviceDTO deviceDTO) {
		Device device = new Device(deviceDTO.getIdplayer(), deviceDTO.getHeartbeat(), deviceDTO.getPressure(), deviceDTO.getBreath());
		return device;
	}
	
	
	@Override
	public List<DeviceDTO> toDTOList(List<Device> deviceList) {
		
		List<DeviceDTO> deviceDTOList = new ArrayList<DeviceDTO>();
		
		
		for(Device device : deviceList) {
			
			
			deviceDTOList.add(toDTO(device));
		}
		return deviceDTOList;
	}



} 

	
	
	
	
	
