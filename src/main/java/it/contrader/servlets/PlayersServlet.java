package it.contrader.servlets;

import java.util.List;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.PlayersDTO;
import it.contrader.service.Service;
import it.contrader.service.PlayersService;

/**
 * Servlet implementation class PlayerServlet
 */
public class PlayersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayersServlet() {
        // TODO Auto-generated constructor stub
    }
    
    public void updateList(HttpServletRequest request) {
		Service<PlayersDTO> service = new PlayersService();
		List<PlayersDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
    }

    
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service<PlayersDTO> service = new PlayersService();
		String mode = request.getParameter("mode");
		PlayersDTO dto;
		int id;
		

		switch (mode.toUpperCase()) {

		case "PLAYERSLIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/players/playersmanager.jsp").forward(request, response);
			break;

		case "READ":
			id = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/players/readparameters.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/players/updateparameters.jsp").forward(request, response);
			
			break;
		}
	}
}


    

