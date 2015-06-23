package ca.etsmtl.gti525.devoir1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * 
 * @author Julie Bastien
 * @codePermanent BASJ10559006
 *
 */
public class AjaxServlet extends HttpServlet {

	private static final long serialVersionUID = -8496452512866921832L;

	/**
	 * 
	 */
	
	public AjaxServlet() {
	}

	public synchronized void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	//public Collection maCollection = new Collection();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
       Collection maCollection = new Collection();
        if (request.getParameter("listeImages") != null){
        	
            request.setAttribute("photo", maCollection.getPhoto(Integer.parseInt(String.valueOf(request.getParameter("listeImages")))-1));
            
            response.setContentType("text/html");
            
            request.setAttribute("dossierVignettes", getServletConfig().getInitParameter("dossierVignettes"));
            RequestDispatcher dis=getServletContext().getRequestDispatcher("/details.jsp");
            dis.include(request, response);
        }
        
        else {
        	request.setAttribute("collection", maCollection.getImages());
			RequestDispatcher dis = getServletContext().getRequestDispatcher("/collection.jsp");
			dis.forward(request, response);
		}
        
	}
}