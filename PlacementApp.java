import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PlacementApp extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	OutputStream os=new FileOutputStream("feedback.txt");
	
	
	String a=req.getParameter("feedback");
	os.write(a);
	}
}