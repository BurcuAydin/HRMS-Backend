package kodlamaio.hrmsnet.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsnet.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrmsnet.business.abstracts.JobTitleService;
import kodlamaio.hrmsnet.entities.concretes.JobTitle;
@Service
public class JobTitleManager implements JobTitleService {

private JobTitleDao jobtitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobtitleDao) {
		super();
		this.jobtitleDao = jobtitleDao;
	}
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobtitleDao.findAll();
	}

}
