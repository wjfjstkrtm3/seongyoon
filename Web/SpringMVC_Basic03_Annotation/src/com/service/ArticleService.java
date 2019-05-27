package com.service;

import com.model.NewArticleCommand;


//@Service 하면 xml 설정에서
// <context:compent-scan base-package="com.controller"/>
// xml 에서 <bean id="" 할 필요가 없다
public class ArticleService {
    public ArticleService() {
      System.out.println("ArticleService 객체 생성자 호출");
    }
    
    public void writeArticle(NewArticleCommand command) {
      // DAO 객체 생성
      // DAO 객체 insert 함수 호출 (DB처리) 생략
      System.out.println("글쓰기 작업 완료 : " + command.toString());
    }
}
