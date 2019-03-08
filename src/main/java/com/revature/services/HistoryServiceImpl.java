package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.History;
import com.revature.repos.HistoryRepo;
import com.revature.services.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
	@Autowired
	private HistoryRepo historyRepo;

	@Override
	public List<History> findAll() {
		// TODO Auto-generated method stub
		return historyRepo.findAll();
	}

	@Override
	public History findById(int id) {
		return historyRepo.getOne(id);
	}

	@Override
	public List<History> findByEmail(String email) {
		return historyRepo.findByUserEmail(email);
	}
	
	@Override
	public List<History> findCompleted() {
		return historyRepo.findCompleted();
	}
	
	@Override
	public List<History> findIncomplete() {
		return historyRepo.findIncomplete();
	}

	@Override
	public History save(History h) {
		h.setHistoryId(0);
		return historyRepo.save(h);
	}

}