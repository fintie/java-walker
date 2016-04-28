package walker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import walker.entity.Job;
import walker.entity.Walker;
import walker.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	@Transactional
	public void save(Job job){
		jobRepository.save(job);
	}
	
	@Transactional
	public List<Job> getAll(String status){
		return jobRepository.getAll(status);
	}
	
	@Transactional
	public void update(String status, Integer id){
		jobRepository.updateJobStatus(status, id);
	}
	
	@Transactional
	public void taken(String status, Walker walker, Integer id){
		jobRepository.updateJobStatus(status, id);
		jobRepository.updateJobWalker(walker, id);
	}
	
	@Transactional
	public List<Job> getJobByStatusAndWalker(String status, Walker walker){
		return jobRepository.getNotFinish(status, walker);
	}
	
	@Transactional
	public Job getJob(Integer id){
		return jobRepository.findOne(id);
	}
	
}
