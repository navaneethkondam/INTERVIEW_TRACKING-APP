package com.bofa.interview.persistence.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bofa.interview.persistence.model.Candidate;

@Repository
public class CandidateDaoImpl extends AbstractDao<Long, Candidate> implements CandidateDao{

	private static final String HQL_FIND_ALL_CANDIDATES = "from Candidate";
	
	public void save(Candidate candidate) {
		saveOrUpdate(candidate);
	}

	public List<Candidate> getAllCandidates() {
		@SuppressWarnings("unchecked")
		List<Candidate> list = getSession().createQuery(HQL_FIND_ALL_CANDIDATES).getResultList();
		if (list == null) {
			list = Collections.emptyList();
		}
		return list;
	}
	

}
