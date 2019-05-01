package com.joker.reply.service;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joker.member.service.Action;
import com.joker.member.service.ActionForward;
import com.joker.reply.db.ReplyDAO;
import com.joker.reply.db.ReplyDTO;

public class GetReply implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ReplyDAO manager = ReplyDAO.getInstance();
		// ��� ����� db�� ���� ���ؿ�
		List<ReplyDTO> list = manager.getReply(Integer.parseInt(request.getParameter("board_no")));
		
		// ���ؿ� ��� ����� �ݺ����� �̿��Ͽ� json �������� ���ڿ� ����(json)�� ���� ����
		String json = "{\"replyList\":["; // replyList�� Ű���� ��
		for (int i = 0; i < list.size(); i++) {
			String id = list.get(i).getId();
			String content = list.get(i).getReply_content();
			Date date = list.get(i).getReply_date();
			SimpleDateFormat df = new SimpleDateFormat("YY-MM-dd");
			int reply_no = list.get(i).getReply_no();
			
			json += "[{\"id\":\"" + id + "\"},";
			json += "{\"reply_date\":\"" + df.format(date) + "\"},";
			json += "{\"reply_content\":\"" + content + "\"},";
			json += "{\"reply_no\":\"" + reply_no + "\"}]";
			
			if (i != list.size() - 1) {
				json += ",";
			}
		}
		json += "]}";
		
		// ������ json ������ ���ڿ��� ȣ���� ������(��������)�� ������
		out.print(json);
		
		return null;
	}	
}