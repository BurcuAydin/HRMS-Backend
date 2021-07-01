package kodlamaio.hrmsnet.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsnet.business.abstracts.CandidateService;

import kodlamaio.hrmsnet.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
}
	@GetMapping("/getall")
	public List<Candidate> getAll(){
		return this.candidateService.getAll();		
	}
}


