import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FlightInfo implements Serializable {
	private String date;
	private String time;
	Airplane airplane;
	Route r = new Route();
	static List<Airplane> ar = new ArrayList();

	public void setSchedule() {

		// 3/18
		ar.add(r.Incheon_Tokyo_Large("2019/3/18", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/18", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/18", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/18", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/18", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/18", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/18", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/18", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/18", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/18", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/18", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/18", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/18", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/18", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/18", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/18", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/18", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/18", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/18", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/18", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/18", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/18", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/18", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/18", "20:00"));

		// 3/19
		ar.add(r.Incheon_Tokyo_Large("2019/3/19", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/19", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/19", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/19", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/19", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/19", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/19", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/19", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/19", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/19", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/19", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/19", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/19", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/19", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/19", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/19", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/19", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/19", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/19", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/19", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/19", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/19", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/19", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/19", "20:00"));

		// 3/20
		ar.add(r.Incheon_Tokyo_Large("2019/3/20", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/20", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/20", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/20", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/20", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/20", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/20", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/20", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/20", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/20", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/20", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/20", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/20", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/20", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/20", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/20", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/20", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/20", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/20", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/20", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/20", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/20", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/20", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/20", "20:00"));

		// 3/21
		ar.add(r.Incheon_Tokyo_Large("2019/3/21", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/21", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/21", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/21", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/21", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/21", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/21", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/21", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/21", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/21", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/21", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/21", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/21", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/21", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/21", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/21", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/21", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/21", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/21", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/21", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/21", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/21", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/21", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/21", "20:00"));

		// 3/22
		ar.add(r.Incheon_Tokyo_Large("2019/3/22", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/22", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/22", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/22", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/22", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/22", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/22", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/22", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/22", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/22", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/22", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/22", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/22", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/22", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/22", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/22", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/22", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/22", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/22", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/22", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/22", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/22", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/22", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/22", "20:00"));

		// 3/23
		ar.add(r.Incheon_Tokyo_Large("2019/3/23", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/23", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/23", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/23", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/23", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/23", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/23", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/23", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/23", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/23", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/23", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/23", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/23", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/23", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/23", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/23", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/23", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/23", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/23", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/23", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/23", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/23", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/23", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/23", "20:00"));

		// 3/24
		ar.add(r.Incheon_Tokyo_Large("2019/3/24", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/24", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/24", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/24", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/24", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/24", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/24", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/24", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/24", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/24", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/24", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/24", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/24", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/24", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/24", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/24", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/24", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/24", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/24", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/24", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/24", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/24", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/24", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/24", "20:00"));

		// 3/25
		ar.add(r.Incheon_Tokyo_Large("2019/3/25", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/25", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/25", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/25", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/25", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/25", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/25", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/25", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/25", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/25", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/25", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/25", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/25", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/25", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/25", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/25", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/25", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/25", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/25", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/25", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/25", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/25", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/25", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/25", "20:00"));

		// 3/26
		ar.add(r.Incheon_Tokyo_Large("2019/3/26", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/26", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/26", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/26", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/26", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/26", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/26", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/26", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/26", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/26", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/26", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/26", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/26", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/26", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/26", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/26", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/26", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/26", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/26", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/26", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/26", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/26", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/26", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/26", "20:00"));

		// 3/27
		ar.add(r.Incheon_Tokyo_Large("2019/3/27", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/27", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/27", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/27", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/27", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/27", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/27", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/27", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/27", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/27", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/27", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/27", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/27", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/27", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/27", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/27", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/27", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/27", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/27", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/27", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/27", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/27", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/27", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/27", "20:00"));

		// 3/28
		ar.add(r.Incheon_Tokyo_Large("2019/3/28", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/28", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/28", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/28", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/28", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/28", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/28", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/28", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/28", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/28", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/28", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/28", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/28", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/28", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/28", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/28", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/28", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/28", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/28", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/28", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/28", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/28", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/28", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/28", "20:00"));

		// 3/29
		ar.add(r.Incheon_Tokyo_Large("2019/3/29", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/29", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/29", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/29", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/29", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/29", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/29", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/29", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/29", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/29", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/29", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/29", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/29", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/29", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/29", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/29", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/29", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/29", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/29", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/29", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/29", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/29", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/29", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/29", "20:00"));

		// 3/30
		ar.add(r.Incheon_Tokyo_Large("2019/3/30", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/30", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/30", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/30", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/30", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/30", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/30", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/30", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/30", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/30", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/30", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/30", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/30", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/30", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/30", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/30", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/30", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/30", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/30", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/30", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/30", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/30", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/30", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/30", "20:00"));

		// 3/31
		ar.add(r.Incheon_Tokyo_Large("2019/3/31", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/3/31", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/3/31", "11:00"));
		ar.add(r.Incheon_London_Large("2019/3/31", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/3/31", "13:00"));
		ar.add(r.Incheon_London_Small("2019/3/31", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/3/31", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/3/31", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/3/31", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/3/31", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/3/31", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/3/31", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/3/31", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/3/31", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/3/31", "11:00"));
		ar.add(r.London_Incheon_Large("2019/3/31", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/3/31", "13:00"));
		ar.add(r.London_Incheon_Small("2019/3/31", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/3/31", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/3/31", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/3/31", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/3/31", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/3/31", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/3/31", "20:00"));

		// 4/1
		ar.add(r.Incheon_Tokyo_Large("2019/4/1", "09:00"));
		ar.add(r.Incheon_Tokyo_Medium("2019/4/1", "10:00"));
		ar.add(r.Incheon_Tokyo_Small("2019/4/1", "11:00"));
		ar.add(r.Incheon_London_Large("2019/4/1", "12:00"));
		ar.add(r.Incheon_London_Medium("2019/4/1", "13:00"));
		ar.add(r.Incheon_London_Small("2019/4/1", "14:00"));
		ar.add(r.Incheon_Paris_Large("2019/4/1", "15:00"));
		ar.add(r.Incheon_Paris_Medium("2019/4/1", "16:00"));
		ar.add(r.Incheon_Paris_Small("2019/4/1", "17:00"));
		ar.add(r.Incheon_Toronto_Large("2019/4/1", "18:00"));
		ar.add(r.Incheon_Toronto_Medium("2019/4/1", "19:00"));
		ar.add(r.Incheon_Toronto_Small("2019/4/1", "20:00"));
		ar.add(r.Tokyo_Incheon_Large("2019/4/1", "09:00"));
		ar.add(r.Tokyo_Incheon_Medium("2019/4/1", "10:00"));
		ar.add(r.Tokyo_Incheon_Small("2019/4/1", "11:00"));
		ar.add(r.London_Incheon_Large("2019/4/1", "12:00"));
		ar.add(r.London_Incheon_Medium("2019/4/1", "13:00"));
		ar.add(r.London_Incheon_Small("2019/4/1", "14:00"));
		ar.add(r.Paris_Incheon_Large("2019/4/1", "15:00"));
		ar.add(r.Paris_Incheon_Medium("2019/4/1", "16:00"));
		ar.add(r.Paris_Incheon_Small("2019/4/1", "17:00"));
		ar.add(r.Toronto_Incheon_Large("2019/4/1", "18:00"));
		ar.add(r.Toronto_Incheon_Medium("2019/4/1", "19:00"));
		ar.add(r.Toronto_Incheon_Small("2019/4/1", "20:00"));

	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
}

