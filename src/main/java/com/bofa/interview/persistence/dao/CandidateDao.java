package com.bofa.interview.persistence.dao;

import java.util.List;

import com.bofa.interview.persistence.model.Candidate;

public interface CandidateDao {

	void save(Candidate candidate);

	List<Candidate> getAllCandidates();

}
