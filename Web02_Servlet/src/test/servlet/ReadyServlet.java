package test.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/ready")
public class ReadyServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw=res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>ready 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>okay!</h1>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
	}
}
