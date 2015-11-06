package cm.dart.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatoCompute
 */
@WebServlet("/CalculatoCompute")
public class CalculatoCompute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatoCompute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("form/calculatoform.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Leftvalue=request.getParameter("leftvalue");
		String Rightvalue=request.getParameter("rightvalue");
		
		double leftvalue = Double.parseDouble(Leftvalue);
		double rightvalue = Double.parseDouble(Rightvalue);
		
		System.out.println("Number 1: " + Leftvalue);
        System.out.println("Number 2: " + Rightvalue);
		
		request.setAttribute("leftvalue", leftvalue);
		request.setAttribute("rightvalue", rightvalue);
		{
			PrintWriter writer = response.getWriter();
			double result = leftvalue + rightvalue;
			
			writer.println(result);
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	}
}
