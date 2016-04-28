package walker.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="WALKERS")
@Entity
public class Walker {
	Integer id;
	String username;
	String password;
	String email;
	Set<Coordinate> coordinates = new HashSet<Coordinate>();
	Set<Job> jobs = new HashSet<Job>();
	String role;

	
	
	
	@GeneratedValue()
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@JoinColumn(name="WALKER_ID")
	@OneToMany(fetch=FetchType.EAGER)
	public Set<Coordinate> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Set<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}
	
	@JoinColumn(name="WALKER_ID")
	@OneToMany(fetch=FetchType.EAGER)
	public Set<Job> getJobs() {
		return jobs;
	}
	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
}
