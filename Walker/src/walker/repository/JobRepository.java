package walker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walker.entity.Job;
import walker.entity.Walker;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer>, JpaSpecificationExecutor<Job>{
	
	@Query("FROM Job j WHERE j.status=?1")
	List<Job> getAll(String status);
	
	
	@Modifying
	@Query("UPDATE Job j SET j.status = ?1 WHERE j.id = ?2")
	void updateJobStatus(String status, Integer id);
	
	@Modifying
	@Query("UPDATE Job j SET j.walker = ?1 WHERE j.id = ?2")
	void updateJobWalker(Walker walker, Integer id);
	
	@Query("FROM Job j WHERE j.status=?1 AND j.walker = ?2")
	List<Job> getNotFinish(String status, Walker walker);
}
