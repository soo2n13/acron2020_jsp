package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import test.dao.MemberDao;
import test.dto.MemberDto;

@WebServlet("/todo/list")
public class TodoListServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<MemberDto> list=MemberDao.getInstance().select();
		
		
		res.setContentType("text/html;charset=utf-8");

		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>ready 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<ul>");
		for(MemberDto tmp:list) {
			pw.println("<li>"+tmp.getNum()+"</li>");
			pw.println("<li>"+tmp.getName()+"</li>");
			pw.println("<li>"+tmp.getAddr()+"</li>");
		}
		pw.println("</ul>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();

	}
}
