package com.tistory.luahius.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.BookCategory;
import com.tistory.luahius.domain.BookRent;
import com.tistory.luahius.domain.LibraryMember;
import com.tistory.luahius.service.LibraryService;

@Controller
public class LibraryController {
	private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);
	
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
		return "joinMember";
	}
	
	/* 도서 등록 페이지로 이동 카테고리를 담아서*/
	@RequestMapping(value = "/addbooks", method=RequestMethod.GET)
	public String AddBooks(Model cateModel){
		logger.debug("AddBooks GET start . . . ");
		List<BookCategory> bookCateList = service.bookCategoryList();
		cateModel.addAttribute("bookCateList", bookCateList);
		return "addBooks";
	}
	
	/* 등록 도서 정보를 받아옴 */
	@RequestMapping(value = "/addbooks", method=RequestMethod.POST)
	public String AddBooks(Book book){
		logger.debug("AddBooks POST 받은 값은 {} 입니다. ", book);
		service.AddBooks(book);
		return "bookList";
	}
		
	/* 도서 리스트 페이지로 이동 */
	@RequestMapping(value = "/booklist")
	public String bookList(Model model){
		logger.debug("booklist GET start . . . ");
		Map<String, Object> returnMap
			= service.bookList();
		
		logger.debug("booklist returnMap {}", returnMap);
		model.addAttribute("bookList",returnMap.get("bookList"));
		
		List<BookCategory> bookCateList = service.bookCategoryList();
		model.addAttribute("bookCateList", bookCateList);
		
		logger.debug("booklist model {}", model);
		return "bookList";
	}
	
	/* 도서 대여 페이지로 이동 */
	@RequestMapping(value = "/rentbooks", method=RequestMethod.GET)
	public String rentBooks(Model model){
		logger.debug("rentBooks GET start . . . ");
		int libmemberNo = 1;
		int bookNo = 10;
		/* 
		 * , @RequestParam(value="1") int libmemberNo, @RequestParam(value="4") int bookNo
		 * 바코드나 칩으로 어느 기계에 정보를 주었다고 가정하고 그 정보와 맞는 회원 정보, 도서 정보를 불러 화면에 보여줌 
		 * */
		LibraryMember returnMember = service.getMemberDetail(libmemberNo);
		Book returnBook = service.getBookDetail(bookNo);
		
		model.addAttribute("returnMember",returnMember);
		model.addAttribute("returnBook",returnBook);
		
		return "rentBooks";
	}
	
	/* 도서 대여 등록 */
	@RequestMapping(value = "/rentbooksfinish", method=RequestMethod.POST)
	public String rentBookFinish(BookRent bookrent){
		logger.debug("rentBookFinish POST start . . . ");
		service.rentBookFinish(bookrent);
		
		return "rentBooks";
	}
	
	
	
	
}
