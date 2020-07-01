package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dto.MemberDto;
@WebServlet("/user/login")
public class loginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		
		String id=req.getParameter("id");
		String pwd=req.getParameter("pw");
		
		
		PrintWriter pw=resp.getWriter();
		
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>ready 페이지</title>");
		pw.println("<link rel='stylesheet' href='../css/bootstrap.css' />");
		pw.println("</head>");
		pw.println("<body>");
		
		if(id.equals("gura")&& pwd.equals("1234")) {
			pw.write("<p>"+id+"님 로그인 되었습니다.<a class='alert-link' href='../index2.html'>확인</a></p>");
		}
		else {
			pw.write("<p>아이디 혹은 비밀번호가 틀립니다.</p>");
		}
		
		pw.println("</ul>");
		pw.println("</body>");
		pw.println("</html>");
		
		pw.close();
	}
}
