import java.sql.SQLException;

import Ibatis.dao.EmpDao;
import Ibatis.dto.Emp;

public class Ibatis_main {

	public static void main(String[] args) {

		EmpDao dao = EmpDao.getInstacne();
		
		Emp e = new Emp();
		e.setEmpno(2222);
		e.setEname("hong2");
		e.setJob("Not");
		e.setSal(10);
		try {
			dao.insertEmp(e);
			Emp empdata = dao.selectEmp("hong2");
			System.out.println(empdata.toString());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
