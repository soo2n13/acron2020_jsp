package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/sub/fotune")
public class FotuneServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> content=new ArrayList<String>();
		
		content.add("조금만 더 수고하여 어려운 고비를 넘기면 마침내 얻을 수 있으니, 인내심으로 참고 견디는 방법이 최선의 길이 될 것이다. 사업가는 금전 융통이 수월할 수 있으니, 투자 가능성이 보이는 길에 용기를 가지고 과감하게 도전할 수 있을 것이다.");
		content.add("그동안 열심히 살아온 당신이기에 오늘 하루는 심신을 단련하는 것이 좋겠다. 무리한 계획에 의한 행동은 오히려 몸이 힘들 수 있고 실제로 득이 되는 건 그다지 많지 않을 것이다. 오늘은 다급하게 움직이지 말고 효율성을 중요하게 여겨야 하는 날이다.");
		content.add("연인을 만난다면 상대방이 충분히 알 수 있도록 애정표현을 해야 한다. 당신의 정확한 표현이 좋은 결과로 연결 되기 때문이다. 조그마한 차이가 모든 삶의 행복과 불행을 결정짓는 중요한 결과로 다가올 수 있다. 개방적인 사고와 표현이 당신을 위한 큰 무기가 될 수가 있으며 또한 든든한 보호막이 될 수도 있다.");
		content.add("평소에 자주 왕래가 없었던 사람이 조언을 구해온다면 최대한 친절하게 응대하는 것이 좋겠다. 훗날 자신도 이와 유사한 상황이 올 것이며 이때 귀한 도움을 받을 수 있다. 주부일 경우에는 자신이 먼저 마음을 열고, 자식과 편안하게 대화를 할 수 있는 상황을 연출하는 것이 좋을 것이다.");
		content.add("육체적, 정신적으로 활력이 샘솟고, 어떤 일이든 할 수 있을 만큼 좋은 상태이다. 가능하다면 적극적으로 자신에게 주어진 일에 최선을 다하는 것이 당신이나 주위사람들을 위해서도 유리하다. 힘찬 활력으로 하루를 시작하라. 좋은 결과가 기다리고 있다.");
		content.add("진행하는 일에서 약간의 난처한 상황이 발생할 수도 있게 되는데 생각지도 못한 사람에게서 도움을 받을 수 있으니 오히려 전화위복이 되겠다. 이는 훗날 꼭 갚아야 함이 옳다. 세상이 빠르게 바뀌어 간다 하여 편승하려는 생각은 가급적 안 하는 게 좋겠다. 당신 인생의 항로는 당신의 손으로 결정하는 게 거시적으로 유리하다.");
		
		res.setContentType("text/html;charset=utf-8");

		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>ready 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>오늘의 운세</h1>");
		pw.println("<p>"+content.get(new Random().nextInt(content.size()))+"</p>");
		pw.println("<img src='../img/cap.PNG' />");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
