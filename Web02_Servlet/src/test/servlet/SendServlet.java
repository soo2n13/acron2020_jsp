package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/send")
public class SendServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String result=req.getParameter("msg");
		
		res.setContentType("utf-8");
		
		System.out.println("msg: "+result);
		
		PrintWriter pw=res.getWriter();
		pw.println("ok~");
		pw.close();
	}
}
