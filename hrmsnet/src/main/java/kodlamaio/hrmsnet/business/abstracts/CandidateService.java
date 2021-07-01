package kodlamaio.hrmsnet.business.abstracts;

import java.util.List;

import kodlamaio.hrmsnet.entities.concretes.Candidate;


public interface CandidateService {

	List<Candidate> getAll();
}
