
/*
책은 책이름과 가격을 가지고 있다
책이 출판되면 반드시 책은 책의 이름과 가격을 가지고 있어야한다
책의 이름과 가격 정보는 특정 기능을 통해서만 볼 수 있고 출판된 이후에는 수정할 수 없다
책 이름과 가격 정보는 각각 정보를 읽을 수 있다 
 */
public class Book {
	private String bookName;
	private int bookPrice;
	
	
public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	//	public Book() { // 반드시 ... 책이 생성될때 ... 이름,, 가격을 가져야
//					// 문법적으로 써도 문제없지만 요구사항에 어긋난다
//		
//	}
	public Book(String bookName, int bookPrcie) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		
		
	}
	
	public void BookInfo() {
		System.out.println("책 이름 : bookName" + bookName);
		System.out.println("책 가격 : bookPrice" + bookPrice);
	}
	
	
	
	
	
}



