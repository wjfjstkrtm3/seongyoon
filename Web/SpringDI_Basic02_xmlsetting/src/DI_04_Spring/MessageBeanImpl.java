package DI_04_Spring;

public class MessageBeanImpl implements MessageBean{
  
  private String name;
  private String greeting;
  
  // name 의 초기화 (생성자)
  public MessageBeanImpl(String name) {
    this.name = name; // 생성자를 통해서 memebere field 초기화
  }
  // greeting 의 초기화 (setter 함수)
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
  
  @Override
  public void sayHello() {
      System.out.println(this.name + " / " + this.greeting);
  }

}
