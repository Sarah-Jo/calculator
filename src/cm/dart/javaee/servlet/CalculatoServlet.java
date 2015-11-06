package cm.dart.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatoServlet
 */
@WebServlet("/calculatoservlet")
public class CalculatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CalculatoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Date date = new Date();
		String format = "dd MMM yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String formatedDate = simpleDateFormat.format(date);
		out.append("<html><body>");
		out.append("<title>HELLO</title>");
		out.append("<h2><center><font color=red><br>My App1</center></font></br></h2>");
		out.append("<h3><font color=blue>calculato</font></h3>");
		out.append("<div> Douala, the " +formatedDate+" </div>");
		out.append("<div>");
		out.append("<form action=\"/calculato/save\"method=\"POST\">");
		out.append("<input name=\"name\"= type=\"text\" />");
		out.append("<input type=\"submit\"/>");
		out.append("</form>");
		out.append("</div>");
		out.append("</body></html>");
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
