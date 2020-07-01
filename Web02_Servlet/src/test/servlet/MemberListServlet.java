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
@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<MemberDto> dto=MemberDao.getInstance().select();
		
		res.setContentType("text/html;charset=utf-8");

		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>ready 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<table border='1'>");
		pw.println("<tr>");
		pw.println("<th>번호</th><th>이름</th><th>주소</th>");
		pw.println("</tr>");
		for(MemberDto tmp:dto) {
			pw.println("<tr>");
			pw.println("<td>"+tmp.getNum()+"</td>");
			pw.println("<td>"+tmp.getName()+"</td>");
			pw.println("<td>"+tmp.getAddr()+"</td>");
			pw.println("</tr>");
		}
		pw.println("</ul>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
