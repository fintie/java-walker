package walker.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COORDINATES")
public class Coordinate {
	Integer id;
	Date date;
	Float x;
	Float y;
	Walker walker;

	@GeneratedValue()
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getX() {
		return x;
	}
	public void setX(Float x) {
		this.x = x;
	}
	public Float getY() {
		return y;
	}
	public void setY(Float y) {
		this.y = y;
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
