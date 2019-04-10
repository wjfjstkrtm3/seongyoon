/*
현실세계 ... 설계도가 여러장 ... (연관성)

여러개의 설계도 작성시 .....(관려성) 

기준점
상속관계 (is ~ a : 상속) 무엇은 무엇이다 (부모쪽을 뒤로)
>> 원은 도형이다 (0)
>> 사각형은 도형이다 (O)

포함관계 (has ~ a : 포함) 무엇은 무엇을 가지고 있다  (경찰은 권총을 가지고 있다)
>> 원은 도형을 가지고 있다 (X)
>> 사각형은 도형을 가지고 있다 (X)

----------------------------------------
원 클래스

도형 클래스

>> 상속 (원 extends 도형)

원은 점이다 (X)
점은 정의(x,y)
원은 점을 가지고 있다 (has ~a) 포함관계
>> class 원 { 점 변수명;}


경찰 , 총
경찰은 총이다(is ~ a)(X)
경찰은 총을 가지고 있다(has ~ a)(O)
class 경찰{}
class 총{}

class 경찰{ 총 gun; }
----------------------------------------
예를 들면 
원, 사각형, 삼각형 만드는 설계를 작성하고 싶어요
원 : 한점과 반지름, 그리다, 색상
삼각형 : 세개의 점, 그리다, 색상 
사각형 : 네개의 점, 그리다, 색상
점 : (x,y)

정의
원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형 : (일반화, 추상화) 분모 : 색상, 그리다
원 (구체화, 특수화) -> 점과 반지름

점 정의(x,y)
원은 점이다(X)
삼각형은 점이다(X)
사각형은 점이다(X)

원은 점을 가지고 있다(O)
삼각형은 점을 가지고 있다(O)
사각형은 점을 가지고 있다(O)
(has ~ a)

일반화, 추상화(공통분모) : shape (색상, 그리다)
				   : point(x, y)
class Shape{}
class Point{}

구체화, 특수화(circle, triangle)
 


class A {
	B b;
}

 
 */

// 추상화, 일반화

class Shape {
	String color = "gold";
	void draw() {
		System.out.println("도형을 그리다");
	}
}
class Point {
	int x;
	int y;


	Point() {
//		this.x = 1;
//		this.y = 2;
		this(1,2); // 생성자를 호출하는 this
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}


//원을 만드세요(정의 : 한점과 반지름을 가지고 있다)
// 원은 도형이다(is ~ a) extends 
// 원은 점을 가지고 있다(has ~ a) 참조변수

// 원의 특수성, 구체성 : 반지름

class Circle extends Shape {
	Point center; // member filed(부품이 들어온거임) | has ~ a (포함관계)
	int r; // member filed(구체화, 특수성)
	
		Circle() {
			this.center = new Point(5, 8);
			this.r = 10;
			
		}
		
		Circle(Point center, int r) {
			this.center = center;
			this.r = r;
		}
}
// 문제 1)
// 삼각형 클래스 만드세요
// 정의 : 삼각형은 3개의 점과 색상 그리고 그리다라는 기능을 가지고있다
// Shape, point 활용해서 작업하세요
// 3개의 (x, y), (x, y), (x, y) 의미
// default 삼각형을 그릴수도 있고, 3개의 좌표값을 받아서 그림을 그릴 수도 있다

class triangle extends Shape {
	Point x; // 참조타입 (초기화 : 주소값)
	Point y;
	Point z;
	
	public triangle() {
//		x = new Point(10,20);
//		y = new Point(30,40);
//		z = new Point(50,60);
		this(new Point(10,20), new Point(30,40), new Point(50,60));
	}
	
	public triangle(Point x, Point y, Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void trianglePoint() {
		System.out.printf("x :(%d,%d)y ", x.x, y.y);
		System.out.printf("x :(%d,%d)y ", y.x, y.y);
		System.out.printf("x :(%d,%d)y ", z.x, z.y);
	}
}

public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		Point point = new Point(10, 15);
		Circle c2 = new Circle(point, 20);
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		c2.draw();
	
		triangle tri = new triangle();
		tri.trianglePoint();
		tri.draw();
		
		triangle tir2 = new triangle(new Point(1,2), new Point(3,4), new Point(5,6));
		tri.trianglePoint();
	}

}
