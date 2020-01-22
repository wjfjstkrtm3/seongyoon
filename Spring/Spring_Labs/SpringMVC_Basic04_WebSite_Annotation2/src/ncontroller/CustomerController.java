package ncontroller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.NoticeDao;
import vo.Notice;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	private NoticeDao noticeDao;
		
	@Autowired
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	@RequestMapping("notice.htm")
	public String notices(String pg , String f , String q , Model model) {
		
		int page=1;
		String field="TITLE";
		String query="%%";
				
		//조건 조합
		if(pg != null && !pg.equals("")) {
			page = Integer.parseInt(pg);
		}
				
		if(f != null && !f.equals("")) {
			field = f;
		}
				
		if(q != null && !q.equals("")) {
			query = q;
		}

		//System.out.println(page + field + query);
		//DAO 객체 생성 ... 함수 호출
		List<Notice> list=null;
		try {
			list = noticeDao.getNotices(page, field, query);
		}catch (Exception e) {
			e.printStackTrace();
		} 
		
		//1.ModelAndView
		//ModelAndView 객체 사용가능
		//return new ModelAndView
		
		//Model : 데이터 담기
		//return :view 주소 
		model.addAttribute("list", list); //View 단 페이지에 자동 forward (list 이름으로)
		
		return "/customer/notice.jsp";
	}
	
	
	@RequestMapping("noticeDetail.htm")
	public String noticeDetail(String seq, Model model) {
		
		Notice notice =null;
		try {
			notice = noticeDao.getNotice(seq);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		model.addAttribute("notice", notice);
		return "/customer/noticeDetail.jsp";
	}
	
	//월요일 수업 ... 오늘 과제 미리.....
		//글쓰기 화면 GET
		//@RequestMapping(value="noticeReg.htm",method=RequestMethod.GET)
		//글쓰기 처리 POST (파일업로드)
		//@RequestMapping(value="noticeReg.htm",method=RequestMethod.POST)
		//글삭제하기
		//hint) location.href 
		//return "redirect:notice.htm"
	@RequestMapping(value="noticeReg.htm", method=RequestMethod.GET)
	public String noticeReg() {
		return "noticeReg.jsp";
	}
	
	@RequestMapping(value="noticeReg.htm", method=RequestMethod.POST)
	public String noticeRegOk(Notice n, HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException {
		String filename = n.getFile().getOriginalFilename();
		String path = request.getServletContext().getRealPath("/upload");
		
		String fpath = path + "\\" + filename;
		FileOutputStream fs = new FileOutputStream(fpath);
		fs.write(n.getFile().getBytes());
		fs.close();
		
		n.setFileSrc(filename);
		noticeDao.insert(n);
		return "redirect:notice.htm";
	}
	
	@RequestMapping(value="noticeDel.htm", method=RequestMethod.GET)
	public String noticeDel(String seq) throws ClassNotFoundException, SQLException {
		
		noticeDao.delete(seq);
		return "redirect:notice.htm";
	}
	
	
	@RequestMapping(value="noticeEdit.htm", method=RequestMethod.GET)
	public String noticeEdit(String seq, Model model) throws ClassNotFoundException, SQLException {
		
		Notice notice = noticeDao.getNotice(seq);
		model.addAttribute("notice", notice);
		return "noticeEdit.jsp";
	}
	
	
	
	@RequestMapping(value="noticeEdit.htm", method=RequestMethod.POST)
	public String noticeEditOk(Notice n, HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException {
		
		String filename = n.getFile().getOriginalFilename();
		String path = request.getServletContext().getRealPath("/upload");
		
		String fpath = path + "\\" + filename;
		FileOutputStream fs = new FileOutputStream(fpath);
		fs.write(n.getFile().getBytes());
		fs.close();
		
		n.setFileSrc(filename);
		noticeDao.insert(n);
		
		return "redirect:noticeDetail.htm?seq="+n.getSeq();
	}
	
	
}






