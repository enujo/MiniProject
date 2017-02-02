package com.tistory.luahius.service;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.LibraryMember;

public interface LibraryService {
	
	
	public void AddLibraryMember(LibraryMember member);

	public void AddBooks(Book book);
	
}
