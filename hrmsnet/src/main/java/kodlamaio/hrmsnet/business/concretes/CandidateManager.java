package kodlamaio.hrmsnet.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsnet.business.abstracts.CandidateService;
import kodlamaio.hrmsnet.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrmsnet.entities.concretes.Candidate;
@Service
public class CandidateManager implements CandidateService{

private CandidateDao candidateDao;
	
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll();
		
	}

	
	

}
