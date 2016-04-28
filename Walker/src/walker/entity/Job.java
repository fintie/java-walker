package walker.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="JOBS")
@Entity
public class Job{
	Integer id;
	String name;
	String description;
	Date createTime;
	String status;
	String createBy;
	Walker walker;
	
	
	
	@GeneratedValue()
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	@JoinColumn(name="WALKER_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	public Walker getWalker() {
		return walker;
	}
	public void setWalker(Walker walker) {
		this.walker = walker;
	}
	
	
	
	
	

}
