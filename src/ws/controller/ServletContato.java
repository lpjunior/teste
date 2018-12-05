package ws.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.service.ContatoDAOService;


@WebServlet({"/contatos", "/contatos/*"})
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletContato() {
        super();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	super.service(req, resp);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getPathInfo() != null) {
			buscar(request, response);
		} else {
			listar(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		gravar(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		atualizar(request, response);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		excluir(request, response);
	}
	
	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append(new ContatoDAOService().buscaById(new Long(request.getPathInfo().split("/")[1])));
	}
	
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	private void atualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	private void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	private void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}
