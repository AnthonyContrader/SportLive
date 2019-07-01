package it.contrader.servlets;

import java.util.List;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.DeviceDTO;
import it.contrader.service.Service;
import it.contrader.service.DeviceService;

/**
 * Servlet implementation class DeviceServlet
 */
public class DeviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeviceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void updateList(HttpServletRequest request) {
		Service<DeviceDTO> service = new DeviceService();
		List<DeviceDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service<DeviceDTO> service = new DeviceService();
		String mode = request.getParameter("mode");
		DeviceDTO dto;
		int idplayer, heartbeat, pressure, breath;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "DEVICELIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/device/devicemanager.jsp").forward(request, response);
			break;

		case "READ":
			idplayer = Integer.parseInt(request.getParameter("idplayer"));
			dto = service.read(idplayer);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/device/readdevice.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/device/updatedevice.jsp").forward(request, response);
			
			break;

		case "INSERT":
			idplayer = 2;    	//inserire id del giocatore
			heartbeat = Integer.parseInt(request.getParameter("heartbeat"));
			pressure = Integer.parseInt(request.getParameter("pressure"));
			breath = Integer.parseInt(request.getParameter("breath"));
			
			dto = new DeviceDTO (idplayer, heartbeat, pressure, breath);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/device/devicemanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			heartbeat = Integer.parseInt(request.getParameter("heartbeat"));
			pressure = Integer.parseInt(request.getParameter("pressure"));
			breath = Integer.parseInt(request.getParameter("breath"));
			idplayer = Integer.parseInt(request.getParameter("idplayer"));
			dto = new DeviceDTO (idplayer, heartbeat, pressure, breath);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/device/devicemanager.jsp").forward(request, response);
			break;

		case "DELETE":
			idplayer = Integer.parseInt(request.getParameter("idplayer"));
			ans = service.delete(idplayer);
			request.setAttribute("ans", ans);
			updateList(request); 
			getServletContext().getRequestDispatcher("/device/devicemanager.jsp").forward(request, response);
			break;
		}
	}
}