package kodlamaio.hrmsnet.core.mernis;

import kodlamaio.hrmsnet.entities.concretes.Candidate;

public class FakeMernisCheckManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		// TODO Auto-generated method stub
		return true;
	}

}
