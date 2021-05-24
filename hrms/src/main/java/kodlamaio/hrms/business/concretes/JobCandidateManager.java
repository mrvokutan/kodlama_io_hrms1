package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobCandidateService;
import kodlamaio.hrms.dataAccess.abstracts.JobCandidateDao;
import kodlamaio.hrms.entities.concretes.User;
@Service
public class JobCandidateManager implements JobCandidateService {
	
	private JobCandidateDao jobCandidateDao ;
	@Autowired
	public JobCandidateManager(JobCandidateDao jobCandidateDao) {
		super();
		this.jobCandidateDao = jobCandidateDao;
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
