package be.mil.ccvc.springdemo.springdatarest;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date plannedBeginDate;
	private Date plannedEndDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPlannedBeginDate() {
		return plannedBeginDate;
	}

	public void setPlannedBeginDate(Date plannedBeginDate) {
		this.plannedBeginDate = plannedBeginDate;
	}

	public Date getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

}
