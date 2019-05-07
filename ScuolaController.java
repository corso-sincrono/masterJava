import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;


public class ScuolaController extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
	
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		String articoloScelto=req.getParameter("art");
		
		Diritto x=new Diritto();
		
		String dettaglio=x.getContenutoArticolo(articoloScelto);
	
		out.println("<h1>"+dettaglio+"</h1>");
	
	
	}
	
	
}