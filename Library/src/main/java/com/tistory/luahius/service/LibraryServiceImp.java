package com.tistory.luahius.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.LibraryMember;


@Service
public class LibraryServiceImp implements LibraryService {
	private static final Logger logger = LoggerFactory.getLogger(LibraryServiceImp.class);
	
	@Autowired
	private LibraryDao libraryDao;
	
	@Override
	public void AddLibraryMember(LibraryMember member) {
		logger.debug("AddLibraryMember {}",member);
		libraryDao.InsertLibrarMember(member);
		
	}

	@Override
	public void AddBooks(Book book) {
		logger.debug("AddBooks {}",book);
		libraryDao.insertBooks(book);
		
	}

}
