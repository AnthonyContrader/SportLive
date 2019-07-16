package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.DeviceDTO;

import it.contrader.model.Device;

@Component
public class DeviceConverter extends AbstractConverter<Device,DeviceDTO>{
	@Override
	public Device toEntity(DeviceDTO deviceDTO) {
		Device device = null;
		if (deviceDTO != null) {
			device = new Device(deviceDTO.getId(),deviceDTO.getIdplayer(),deviceDTO.getSerial(),deviceDTO.getHeartbeat(),deviceDTO.getPressure());			
		}
		return device;
	}

	@Override
	public DeviceDTO toDTO(Device device) {
		DeviceDTO deviceDTO = null;
		if (device != null) {
			deviceDTO = new DeviceDTO(device.getId(),device.getIdplayer(),device.getSerial(),device.getHeartbeat(),device.getPressure());
			
		}
		return deviceDTO;
	}
}


