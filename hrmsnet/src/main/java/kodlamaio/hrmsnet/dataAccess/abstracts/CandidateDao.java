package kodlamaio.hrmsnet.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsnet.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate, Integer> {

}
