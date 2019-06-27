package it.contrader.servlets;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.PlayersDTO;
import it.contrader.dto.UserDTO;
import it.contrader.service.Service;
import it.contrader.service.UserService;

public class CoachServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
//	
//	
//	public CoachServlet() {
//	}
//	
//	
//	public void updateList(HttpServletRequest request) {
//		Service<PlayersDTO> service = new PlayersService();
//		List<PlayersDTO>listDTO = service.getAll();
//		request.setAttribute("list", listDTO);
//	}
//	
//	@Override
//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Service<PlayersDTO> service = new PlayersService();
//		String mode = request.getParameter("mode");
//		PlayersDTO dto;
//		int id, idcoach, score;
//		boolean ans;
//
//		switch (mode.toUpperCase()) {
//
//		case "USERLIST":
//			updateList(request);
//			getServletContext().getRequestDispatcher("/players/playersmanager.jsp").forward(request, response);
//			break;
//
//		case "READ":
//			id = Integer.parseInt(request.getParameter("id"));
//			dto = service.read(id);
//			request.setAttribute("dto", dto);
//			
//			if (request.getParameter("update") == null) {
//				 getServletContext().getRequestDispatcher("/players/readplayers.jsp").forward(request, response);
//				
//			}
//			
//			else getServletContext().getRequestDispatcher("/players/updateplayers.jsp").forward(request, response);
//			
//			break;
//
//		case "INSERT":
//			idcoach = Integer.parseInt(request.getParameter("idcoach"));
//			String username = request.getParameter("username").toString();
//			String password = request.getParameter("password").toString();
//			String playertype = request.getParameter("playertype").toString();
//			score = Integer.parseInt(request.getParameter("score"));
//			
//			dto = new PlayersDTO (idcoach, username,password,playertype, score);
//			ans = service.insert(dto);
//			request.setAttribute("ans", ans);
//			updateList(request);
//			getServletContext().getRequestDispatcher("/players/playersmanager.jsp").forward(request, response);
//			break;
//			
//		case "UPDATE":
//			
//			idcoach = Integer.parseInt(request.getParameter("idcoach"));
//			username = request.getParameter("username");
//			password = request.getParameter("password");
//			playertype = request.getParameter("playertype");
//			score = Integer.parseInt(request.getParameter("score"));
//			
//			id = Integer.parseInt(request.getParameter("id"));
//			dto = new UserDTO (id, idcoach ,username, password, playertype, score);
//			ans = service.update(dto);
//			updateList(request);
//			getServletContext().getRequestDispatcher("/players/playersmanager.jsp").forward(request, response);
//			break;
//
//		case "DELETE":
//			id = Integer.parseInt(request.getParameter("id"));
//			ans = service.delete(id);
//			request.setAttribute("ans", ans);
//			updateList(request);
//			getServletContext().getRequestDispatcher("/players/playersmanager.jsp").forward(request, response);
//			break;
//		}
//	}

}
