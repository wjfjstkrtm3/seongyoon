package kr.or.bit;

public class Sheep {
//	배의 시나리오
//	배는 이름과 문의 수와 최대 탑승인원과 가격과 배의 무게가 포함되어야한다.
//	배가 만들어지면 이름과 문의 수 , 탑승인원 , 가격 , 무게가 반드시 포함되어야 한다.
//	배가 만들어지면 배의 정보는 수정 불가하다.
	
	private String sheepName;
	private int door;
	private int maxPerson;
	private int price;
	private int weight;
	// 이름 
	// 문의 수
	// 최대 탑승인원
	// 가격
	// 배의 무게
	
	public Sheep(String sheepName, int door, int maxPerson, int price, int weight) {
		
		this.sheepName = sheepName;
		this.door = door;
		this.maxPerson = maxPerson;
		this.price = price;
		this.weight = weight;
		
	}
	


	public String getSheepName() {
		return sheepName;
	}

	public int getDoor() {
		return door;
	}

	public int getMaxPerson() {
		return maxPerson;
	}

	public int getWeight() {
		return weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}
