package com.service;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

import com.bean.Book;

public interface IBookService {

	@PreAuthorize("hasRole('ROLE_WRITE')") // 함수를 태우기 전에 이 권한을 가지고 있는애만 함수 탄다
										   // 파라미터로 검증
	void addBook(Book book);
	
	
	@PostAuthorize("returnObject.owner == authentication.name")
	Book getBook();
	/*
	   현재 로그인한 계정 : hong 
	   Book b = new Book("구운몽","kglim")
	   
	   "kglim" != "hong" > false 접근권한 예외 
	   return  b; 
	*/
	
	/*
	 Book bo = new Book("홍길동전","kglim")
	 (bo.kglim == "kglim")
	 delelteBook(bo)
	 */
	@PreAuthorize("#book.owner == authentication.name") // #이 붙여져있는건
														// 함수를 타기전에 파라미터를 미리 끄집어내서 사용 할 수 있음
														// 리턴값으로 검증
	void deleteBook(Book book);
}









