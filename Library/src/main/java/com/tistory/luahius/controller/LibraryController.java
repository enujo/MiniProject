package com.tistory.luahius.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tistory.luahius.HomeController;
import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.LibraryMember;
import com.tistory.luahius.service.LibraryService;

@Controller
public class LibraryController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	LibraryService service;
	/* 로그인 페이지로 이동 */
	@RequestMapping(value = "/")
	public String LibraryHome(){							
		logger.debug("LibraryHome loading . . .");
		return "login";
	}
	
	/* 회원 등록페이지로 이동 */
	@RequestMapping(value = "/joinmember", method=RequestMethod.GET)
	public String JoinLibrary(){
		logger.debug("JoinLibrary GET loading . . .");
		return "joinMember";
	}
	
	/* 회원을 등록하면 정보를 받아옴 */
	@RequestMapping(value = "/joinmember", method=RequestMethod.POST)
	public String JoinLibrary(LibraryMember member){
		logger.debug("JoinLibrary POST 받은 값은 {} 입니다. ", member);
		service.AddLibraryMember(member);
		return "rentList";
	}
	
	/* 도서 등록 페이지로 이동 */
	@RequestMapping(value = "/addbooks", method=RequestMethod.GET)
	public String AddBooks(){
		logger.debug("AddBooks GET start . . . ");
		return "addBooks";
	}
	
	/* 등록 도서 정보를 받아옴 */
	@RequestMapping(value = "/addbooks", method=RequestMethod.POST)
	public String AddBooks(Book book){
		logger.debug("AddBooks POST 받은 값은 {} 입니다. ", book);
		service.AddBooks(book);
		return "rentList2";
	}
	
	
	
}
