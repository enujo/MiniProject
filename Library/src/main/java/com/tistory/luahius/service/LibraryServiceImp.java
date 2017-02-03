package com.tistory.luahius.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.BookCategory;
import com.tistory.luahius.domain.BookRent;
import com.tistory.luahius.domain.LibraryMember;


@Service
public class LibraryServiceImp implements LibraryService {
	private static final Logger logger = LoggerFactory.getLogger(LibraryServiceImp.class);
	
	@Autowired
	private LibraryDao libraryDao;
	
	@Override	/*도서장르 리스트 불러옴*/
	public List<BookCategory> bookCategoryList() {
		logger.debug("bookCategoryList");
		List<BookCategory> bookCateList = libraryDao.getBookCate();
		logger.debug("bookCategoryList {} ", bookCateList);
		return bookCateList;
	}
	
	@Override
	public void AddLibraryMember(LibraryMember member) {
		logger.debug("AddLibraryMember {}",member);
		libraryDao.InsertLibrarMember(member);
		
	}

	@Override
	public void AddBooks(Book book) {
		logger.debug("AddBooks {}",book);
		libraryDao.InsertBooks(book);
		
	}

	@Override
	public Map<String, Object> bookList() {
		logger.debug("bookList ");
		List<Book> bookList = libraryDao.AllBookList();
		logger.debug("bookList bookList {} ",bookList);
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("bookList", bookList);
		logger.debug("bookList returnMap {} ",returnMap);
		return returnMap;
		
	}
	
	/* 도서관 회원 1명의 정보를 불러옴 */
	@Override
	public LibraryMember getMemberDetail(int libmemberNo) {
		logger.debug("getMemberDetail libmemberNo의 값 : {} ",libmemberNo);
		LibraryMember returnMember = libraryDao.getMemberDetail(libmemberNo);
		
		logger.debug("getMemberDetail returnMember의 값 : {} ",returnMember);
		
		
		return returnMember;
	}
	/* 한권의 도서정보를 불러옴 */
	@Override
	public Book getBookDetail(int bookNo) {
		Book returnBook = libraryDao.getBookDetail(bookNo);
		return returnBook;
	}
	
	/*도서 대여 등록 완료*/
	@Override
	public void rentBookFinish(BookRent bookrent) {
		logger.debug("rentBookFinish BookRent의 값 : {}",bookrent);
		libraryDao.rentStartBook(bookrent);
		
	}

	

	

}
