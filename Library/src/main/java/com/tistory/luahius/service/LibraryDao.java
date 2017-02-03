package com.tistory.luahius.service;

import java.util.List;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.BookCategory;
import com.tistory.luahius.domain.BookRent;
import com.tistory.luahius.domain.LibraryMember;

public interface LibraryDao {

	public int InsertLibrarMember(LibraryMember member);

	public int InsertBooks(Book book);

	public List<Book> AllBookList();

	public List<BookCategory> getBookCate();

	public LibraryMember getMemberDetail(int libmemberNo);

	public Book getBookDetail(int bookNo);

	public int rentStartBook(BookRent bookrent);

	
}
