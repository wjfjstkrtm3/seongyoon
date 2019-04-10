// 상속관계에서 다형성 

class Pbase {
	int p = 100;
	
}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {
	
}

// Cbase 클래스 하고 Dbase 클래스는 같은 부모이다





public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		
		Cbase c = new Cbase();
		System.out.println(c.toString());
		// 다형성 : 부모타입의 참조변수가 자식타입의 주소값을 가질 수있다 (단 상속관계에서)
		// 그렇지만 메모리에 모든 자원에 접근하는 것이 아니고 자신(부모) 타입만 접근가능
		Pbase p = c; // 다형성
		System.out.println("p 부모타입 변수 : " + p.toString());
		System.out.println("p 상속한 c타입 변수 : " + c.toString());
		
		System.out.println(c.c + "/" + c.p);
		System.out.println("자신의 것만(부모타입): " + p.p);
		
		
		Dbase d = new Dbase();
		p = d; // P라는 변수는 d의 주소를 가질 수 있고, c의 주소를 가질 수 있다
		// c와 d는 같은 부모를 가지고 있다
		
		////////////////////////////////////
		
		Dbase dd = (Dbase)p; // 부모는 (상위타입) -> 하위타입인 자식에게 ...
		// 부모타입의 주소 값을 자식타입에 전달할때는 (상위->하위)
		// 반드시 하위타입에 맞는 casting을 해야 한다
		
		
		
		

	}

}

