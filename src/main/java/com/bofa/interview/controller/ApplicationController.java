package com.bofa.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bofa.interview.persistence.model.Candidate;
import com.bofa.interview.service.CandidateService;

@Controller
public class ApplicationController {

	@Autowired
	private CandidateService candidateService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainPage() {
		return "index";
	}

	@RequestMapping(value = "/addCandidate", method = RequestMethod.GET)
	public String addCandidate(ModelMap model) {
		return "addCandidate";
	}

	@RequestMapping(value = "/addCandidate", method = RequestMethod.POST)
	public String saveCandidate(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("resume") MultipartFile resume, ModelMap model,
			RedirectAttributes redirectAttributes) {
		if (resume.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:/addCandidate";
		}
		Candidate candidate = new Candidate();
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		candidate.setEmail(email);
		try {
			byte[] bytes = resume.getBytes();
			candidate.setResume(bytes);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		candidateService.addCandidate(candidate);
		return "main";
	}

	@RequestMapping(value = "/updateCandidate/{id}", method = RequestMethod.GET)
	public String updateCandidate(@ModelAttribute("Candidate") Candidate candidate, ModelMap model) {
		Candidate updatedCandidate = candidateService.updateCandidate(candidate);
		model.addAttribute("candidate", updatedCandidate);
		return "addCandidate";
	}

	@RequestMapping(value = "/listOfCandidates")
	public String listOfCandidates(ModelMap model) {
		List<Candidate> candidates = candidateService.getAllCandidates();
		model.addAttribute("candidates",candidates);
		return null;

	}

}
