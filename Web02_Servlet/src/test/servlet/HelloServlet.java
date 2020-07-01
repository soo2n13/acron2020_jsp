package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 1. HttpServlet 상속
 * 2. service() 메소드 오버라이딩
 * 3. service() 메소드에 전달되는 HttpServletPesponse 객체를 활용해 응답되는 코드 작성 
 * 4. /Hello 에 요청이 왔을때 실제 동작되도록 매핑
 */
@WebServlet("/hello")  //매핑 설정
public class HelloServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		pw.write("merong!");
		pw.close();
	}
}
