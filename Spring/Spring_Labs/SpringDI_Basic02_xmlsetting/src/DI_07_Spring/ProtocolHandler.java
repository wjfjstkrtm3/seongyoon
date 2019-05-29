package DI_07_Spring;

import java.util.List;

//이 클래스가 Filter 사용하기
//이 코드가 이해안되면 복습
public class ProtocolHandler {
	
	private List<MyFilter> filters; //filters 라는 Collection 주소값
	
	public List<MyFilter> getFilters(){
		return this.filters;
	}
	
	public void setFilters(List<MyFilter> filters) {
		this.filters = filters;
	}
	
	//검증하는 함수
	public int filter_Length() {
		return this.filters.size();
	}
}
