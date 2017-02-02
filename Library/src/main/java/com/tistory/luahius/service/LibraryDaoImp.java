package com.tistory.luahius.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.LibraryMember;


@Repository
public class LibraryDaoImp implements LibraryDao{
	private static final Logger logger = LoggerFactory.getLogger(LibraryDaoImp.class);
	
	@Autowired
	private SqlSessionTemplate  sqlSession;
	
	private final String NS = "com.tistroy.luahius.service.LibraryMapper.";
	
	@Override
	public int InsertLibrarMember(LibraryMember member) {
		logger.debug("sqlSession {}", sqlSession);
		logger.debug("InsertLibrarMember {}", member);
		return sqlSession.insert(NS+"insertLibraryMember", member);
	}

	@Override
	public int insertBooks(Book book) {
		logger.debug("insertBooks {}", book);
		return sqlSession.insert(NS+"insertBooks", book);
		
	}

}
