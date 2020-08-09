package com.nubiform.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class MyService {
	public Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}
}