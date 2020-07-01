package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		String now=d.toString();
		
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>ready 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>"+now+"</h1>");
		pw.println("<img src='img/cap.PNG' />");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
