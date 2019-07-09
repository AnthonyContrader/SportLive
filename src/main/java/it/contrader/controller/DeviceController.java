package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

import it.contrader.dto.DeviceDTO;
import it.contrader.services.DeviceService;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/Device")
public class DeviceController {

	
		private final DeviceService deviceService;
		
		private HttpSession session;
	
		@Autowired
		public DeviceController( DeviceService deviceService) {
			this.deviceService =deviceService;
		}
	
		@RequestMapping(value = "/deviceManagement", method = RequestMethod.GET)
		public String deviceManagement(HttpServletRequest request) {
			request.setAttribute("device", getDevices());
			return "device/deviceManagement";
		}
	
		@RequestMapping(value = "/deviceManagementD", method = RequestMethod.GET)
		public String deviceManagementD(HttpServletRequest request) {
			request.setAttribute("device", getDevices());
			return "device/deviceManagementD";
		}
	
		
		public List<DeviceDTO> getDevices() {
			List<DeviceDTO> tmp = deviceService.getListaDeviceDTO();
			List<DeviceDTO> deviceList = new ArrayList<>();
			for (DeviceDTO device : tmp) {
				if (!(device.getId()==0)) {
					deviceList.add(device);
				}
			}
	
			return deviceList;
		}
	
	
		@RequestMapping(value ="/deleteDevice", method = RequestMethod.GET)
		public String deleteDevice(HttpServletRequest request) {
			int idDev = Integer.parseInt(request.getParameter("id"));
			deviceService.deleteDeviceById(idDev);
			request.setAttribute("device", getDevices());
			return "device/deviceManagement";
		}
		
		
		@RequestMapping(value = "/redirectUpdate", method = RequestMethod.GET)
		public String redirectUpdate(HttpServletRequest request) {
			int idDev = Integer.parseInt(request.getParameter("id"));
			DeviceDTO device = deviceService.getDeviceDTOById(idDev);
			request.setAttribute("device", device);
			return "device/updateDevice";
		}
		
		@RequestMapping(value = "/updateDevice", method = RequestMethod.POST)
		public String updateDevice(HttpServletRequest request)
		{
			int idUpdate = Integer.parseInt(request.getParameter("id"));
			int idPalyerUpdate = Integer.parseInt(request.getParameter("idPlayer"));
			String heartbeatUpdate = request.getParameter("heartbeat");
			String pressureUpdate = request.getParameter("pressure");
			String breathUpdate = request.getParameter("breath");
			
			
			final DeviceDTO device = new DeviceDTO(idUpdate, idPalyerUpdate, heartbeatUpdate, pressureUpdate, breathUpdate);
			device.setId(idUpdate);
			
			deviceService.updateDevice(device);
			request.setAttribute("device", getDevices());
			return "device/deviceManagement";	
			
		}
		
		@RequestMapping(value = "/updateDeviceD", method = RequestMethod.POST)
		public String updateDeviceD(HttpServletRequest request)
		{
			int idUpdate = Integer.parseInt(request.getParameter("id"));
			int idPalyerUpdate = Integer.parseInt(request.getParameter("idPlayer"));
			String heartbeatUpdate = request.getParameter("heartbeat");
			String pressureUpdate = request.getParameter("pressure");
			String breathUpdate = request.getParameter("breath");
			
			
			final DeviceDTO device = new DeviceDTO(idUpdate, idPalyerUpdate, heartbeatUpdate, pressureUpdate, breathUpdate);
			device.setId(idUpdate);
			
			deviceService.updateDevice(device);
			request.setAttribute("device", getDevices());
			return "device/deviceManagementD";	
			
		}
		@RequestMapping(value = "/insertDevice", method = RequestMethod.POST)
		public String insertDevice(HttpServletRequest request) {
			int id = Integer.parseInt(request.getParameter("id"));
			int idPalyer = Integer.parseInt(request.getParameter("idPlayer"));
			String heartbeat = request.getParameter("heartbeat");
			String pressure = request.getParameter("pressure");
			String breath = request.getParameter("breath");
			
			
			DeviceDTO deviceDTO = new DeviceDTO(id, idPalyer, heartbeat, pressure, breath);
			
			deviceService.insertDevice(deviceDTO);
			
			request.setAttribute("device", getDevices());
			
			return "device/deviceManagement";		
		}
	
	}

	