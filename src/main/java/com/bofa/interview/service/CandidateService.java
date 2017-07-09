package com.bofa.interview.service;

import java.util.List;

import com.bofa.interview.persistence.model.Candidate;

public interface CandidateService {

	Candidate addCandidate(Candidate candidate);

	Candidate updateCandidate(Candidate candidate);

	List<Candidate> getAllCandidates();

}
