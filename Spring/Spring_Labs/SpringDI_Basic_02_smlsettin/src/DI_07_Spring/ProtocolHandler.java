package DI_07_Spring;

import java.util.List;

public class ProtocolHandler {

	private List<MyFilter> filters;
	
	public List<MyFilter> getFilters() {
		return this.filters;
	}
	
	public void setFilters(List<MyFilter> filters) {
		this.filters = filters;
	}
	
	public int filter_Length() {
		return this.filters.size();
	}
}
