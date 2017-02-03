package com.tistory.luahius.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tistory.luahius.domain.Book;
import com.tistory.luahius.domain.BookCategory;
import com.tistory.luahius.domain.BookRent;
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
	public int InsertBooks(Book book) {
		logger.debug("insertBooks {}", book);
		return sqlSession.insert(NS+"insertBooks", book);
		
	}

	@Override
	public List<Book> AllBookList() {
		logger.debug("AllBookList ");
		return sqlSession.selectList(NS+"AllBookList");
	}

	@Override	/*도서카테고리를 가져옴*/
	public List<BookCategory> getBookCate() {
		logger.debug("getBookCate ");
		return sqlSession.selectList(NS+"getBookCate");
	}

	@Override	/*도서관 회원 1명의 정보 가져옴*/
	public LibraryMember getMemberDetail(int libmemberNo) {
		logger.debug("getMemberDetail libmemberNo는 {} 이다 ",libmemberNo);
		return sqlSession.selectOne(NS+"getMemberDetail", libmemberNo);
	}

	@Override	/*한권의 도서 정보를 가져옴*/
	public Book getBookDetail(int bookNo) {
		return sqlSession.selectOne(NS+"getBookDetail", bookNo);
	}

	@Override	/*도서 대여 등록*/
	public int rentStartBook(BookRent bookrent) {
		return sqlSession.insert(NS+"rentStartBook", bookrent);
	}

}
