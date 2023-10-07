package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.dao.DeptDAO;
import com.exam.dto.DeptDTO;

@Service("xxx")
public class DeptServiceImpl implements DeptService {

	//생성자로 주입받는 방법
	DeptDAO dao;

	//기본생성자 제거 필수
	public DeptServiceImpl(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<DeptDTO> deptList() {
		return dao.deptList();
	}
	
	
}
