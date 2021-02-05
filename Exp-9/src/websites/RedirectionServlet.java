package websites;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectionServlet
 */
@WebServlet("/RedirectionServlet")
public class RedirectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");  
		PrintWriter pw = response.getWriter(); 

		String re = request.getParameter("sites");
		if(re.equals("Amazon"))
			response.sendRedirect("http://www.amazon.com"); 
		else if(re.equals("Flipkart"))
			response.sendRedirect("http://www.flipkart.com");
		else if(re.equals("Apple"))
			response.sendRedirect("http://www.apple.com");
		else if(re.equals("Wallmart"))
			response.sendRedirect("http://www.Wallmart.com");
		else if(re.equals("Tatacliq"))
			response.sendRedirect("http://www.Tatacliq.com");
	}

}
