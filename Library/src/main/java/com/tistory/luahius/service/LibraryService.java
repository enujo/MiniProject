package com.tistory.luahius.service;

import java.util.List;
import java.util.Map;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.BookCategory;
import com.tistory.luahius.domain.BookRent;
import com.tistory.luahius.domain.LibraryMember;

public interface LibraryService {
	
	
	public void AddLibraryMember(LibraryMember member);

	public void AddBooks(Book book);

	public Map<String, Object> bookList();

	public List<BookCategory> bookCategoryList();

	public LibraryMember getMemberDetail(int libmemberNo);

	public Book getBookDetail(int bookNo);

	public void rentBookFinish(BookRent bookrent);

	
}
