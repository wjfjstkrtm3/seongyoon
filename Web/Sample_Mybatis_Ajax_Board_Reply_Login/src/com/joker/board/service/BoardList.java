package com.joker.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joker.board.db.BoardDAO;
import com.joker.board.db.BoardDTO;
import com.joker.member.service.Action;
import com.joker.member.service.ActionForward;

public class BoardList implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("BoardList");
		// get ������� �Ѿ���� section �� ������ ����
		String section = request.getParameter("section");

		// �˻����� �� ����� ����
		String sel = request.getParameter("sel");
		String find = request.getParameter("find");

		// ���� ������ ��ȣ
		String num = request.getParameter("num");
		if (num == null)
			num = "1";
		int currentPage = Integer.parseInt(num);

		// �� �������� ����� �Խù� ��
		int pageSize = 10;
		// �ش� ���������� ������ ���ڵ� / ������ ���ڵ�
		int startRow = (currentPage - 1) * pageSize + 1;
		int endRow = currentPage * pageSize;

		BoardDAO manager = BoardDAO.getInstance();
		// �ش� section�� �Խù� ��
		int count = manager.getCount(section);

		// section�� �˻� �Խù�
		Map<String, Object> fMap = new HashMap<>();

		int fcount = 0;
		if (sel != null && find != null) {
			fMap.put("section", section);
			fMap.put("sel", sel);
			fMap.put("find", "%" + find + "%");

			fcount = manager.getfCount(fMap);
			System.out.println("fcount : " + fcount);
		}
		
		List<BoardDTO> list = null;
		List<BoardDTO> flist = null;
		
		// �˻����� �ʾ��� ��
		if (count > 0 && sel == null && find == null) {
			Map<String, Object> map = new HashMap<>();
			map.put("startRow", startRow);
			map.put("endRow", endRow);
			map.put("section", section);
			list = manager.getList(map);
		} 
		// �˻����� ��
		else if (count > 0 && fcount > 0 && sel != null && find != null) {
			fMap.put("startRow", startRow);
			fMap.put("endRow", endRow);
			flist = manager.getfList(fMap);
		}

		// �� ������ ��
		int pageCount = 0;
		if (count > 0 && sel == null && find == null) {
			pageCount = count / pageSize + ((count % pageSize == 0) ? 0 : 1);
		} else if (sel != null && find != null) { // �˻����� ���
			pageCount = fcount / pageSize + ((fcount % pageSize == 0) ? 0 : 1);
		}

		// pageBlock ��
		int pageBlock = 10;
		// page ���۹�ȣ �� �� ��ȣ
		int startPage = ((currentPage - 1) / pageBlock) * pageBlock + 1;
		int endPage = startPage + pageBlock - 1;

		if (endPage > pageCount) {
			endPage = pageCount;
		}
		
		// ���������� ������ �� ����
		request.setAttribute("section", section);
		request.setAttribute("sel", sel);
		request.setAttribute("find", find);
		request.setAttribute("num", currentPage);
		request.setAttribute("count", count);
		request.setAttribute("fcount", fcount);
		request.setAttribute("list", list);
		request.setAttribute("flist", flist);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/boardlist.jsp");

		return forward;
	}
}
