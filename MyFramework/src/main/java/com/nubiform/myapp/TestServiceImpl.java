package com.nubiform.myapp;

import java.util.HashMap;
import java.util.List;

import com.nubiform.util.MyService;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends MyService implements TestService {
	
	@Override
	public void getList() {
		List<HashMap> list = getSqlSession().selectList("test.getList");
	}
	
}