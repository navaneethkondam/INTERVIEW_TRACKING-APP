package com.bofa.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bofa.interview.persistence.dao.CandidateDao;
import com.bofa.interview.persistence.model.Candidate;

@Service("candidateService")
@Transactional
public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	private CandidateDao candidateDao;

	public Candidate addCandidate(Candidate candidate) {
		candidateDao.save(candidate);
		return 	candidate;
	}

	public Candidate updateCandidate(Candidate candidate) {
		candidateDao.save(candidate);
		return candidate;
	}

	public List<Candidate> getAllCandidates() {
		
		return candidateDao.getAllCandidates();
	}

}
