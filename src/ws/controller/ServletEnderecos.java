package ws.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/enderecos/*")
public class ServletEnderecos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletEnderecos() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.getWriter().append("Served at: ").append(request.getContextPath()).append(" called by method: ").append(request.getMethod()).append(" on: ").append(request.getServletPath());
		
		String pathInfo = request.getPathInfo(); // /{value}/test
		String[] pathParts = pathInfo.split("/");
		String part1 = pathParts[1]; // {value}
		String part2 = pathParts[2]; // test
		response.getWriter().append("\n").append(part1).append("\n").append(part2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
