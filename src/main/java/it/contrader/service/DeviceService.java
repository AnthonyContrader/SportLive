package it.contrader.service;

import it.contrader.converter.DeviceConverter;
import it.contrader.dao.DeviceDAO;
import it.contrader.dto.DeviceDTO;
import it.contrader.model.Device;

public class DeviceService extends AbstractService<Device, DeviceDTO>  {

	public DeviceService() {
		this.dao = new DeviceDAO();
		this.converter = new DeviceConverter();
	}

}
