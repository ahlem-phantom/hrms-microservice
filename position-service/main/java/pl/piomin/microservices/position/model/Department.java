package pl.piomin.microservices.position.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@NoArgsConstructor
@Table(name = "departments")
public final class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer departmentId;
	
	@Column(name = "dname", length = 100)
	private String dname;
	
	@Column(name = "loc", length = 100)
	private String loc;

	
	public Department(Integer departmentId, String dname, String loc) {
		this.departmentId = departmentId;
		this.dname = dname;
		this.loc = loc;
	}

		
}