package walker.repository;



//import java.util.List;
//import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;

import walker.entity.Walker;

public interface WalkerRepository extends JpaRepository<Walker, Integer>{
	
//	@Query("FROM Walker w WHERE BINARY w.username = ?1 and w.password = ?2")
//	List<Walker> getUser(String userName, String password);
	Walker getByUsernameAndPassword(String userName, String password);
	
}