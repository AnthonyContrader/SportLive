package it.contrader.servlets;

import java.util.List;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.ParametersDTO;
import it.contrader.dto.ParametersDTO;
import it.contrader.service.Service;
import it.contrader.service.ParametersService;
import it.contrader.service.ParametersService;


public class ParametersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParametersServlet() {       
    }
	
    public void updateList(HttpServletRequest request) {
		Service<ParametersDTO> service = new ParametersService();
		List<ParametersDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service<ParametersDTO> service = new ParametersService();
		String mode = request.getParameter("mode");
		ParametersDTO dto;
		int id, data, age, height, weight, gol, gp, mp; 
		boolean ans;

		switch (mode.toUpperCase()) {

		case "USERLIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/user/usermanager.jsp").forward(request, response);
			break;

		case "READ":
			id = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/user/readuser.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/user/updateuser.jsp").forward(request, response);
			
			break;

		case "INSERT":
			data = Integer.parseInt (request.getParameter("data"));
			age =Integer.parseInt (request.getParameter("age"));
			height = Integer.parseInt (request.getParameter("height"));
			weight = Integer.parseInt (request.getParameter("weight"));
			gol = Integer.parseInt (request.getParameter("gol"));
			gp = Integer.parseInt (request.getParameter("gp"));
			mp = Integer.parseInt (request.getParameter("mp"));
			dto = new ParametersDTO (data, age, height, weight, gol, gp, mp);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/user/usermanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			data = Integer.parseInt (request.getParameter("data"));
			age = Integer.parseInt (request.getParameter("age"));
			height = Integer.parseInt (request.getParameter("height"));
			weight = Integer.parseInt (request.getParameter("weight"));
			gol = Integer.parseInt (request.getParameter("gol"));
			gp = Integer.parseInt (request.getParameter("gp"));
			mp = Integer.parseInt (request.getParameter("mp"));
			id = Integer.parseInt(request.getParameter("id"));
			dto = new ParametersDTO (data, age, height, weight, gol, gp, mp);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/user/usermanager.jsp").forward(request, response);
			break;

		case "DELETE":
			id = Integer.parseInt(request.getParameter("id"));
			ans = service.delete(id);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/user/usermanager.jsp").forward(request, response);
			break;
		}
	}
}