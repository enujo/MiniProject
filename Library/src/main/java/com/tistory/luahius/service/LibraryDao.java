package com.tistory.luahius.service;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.LibraryMember;

public interface LibraryDao {

	public int InsertLibrarMember(LibraryMember member);

	public int insertBooks(Book book);
	
}
