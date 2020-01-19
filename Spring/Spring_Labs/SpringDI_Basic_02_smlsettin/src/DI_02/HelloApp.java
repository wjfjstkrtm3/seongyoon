package DI_02;

public class HelloApp {

	public static void main(String[] args) {
			MessageBean bean = new MessageBean_kr();
			bean.sayHello();
			
			MessageBean bean2 = new MessageBean_en();
			bean2.sayHello();
	}

}
