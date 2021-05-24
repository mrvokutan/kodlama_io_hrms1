package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends User{
	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id ;
	@Column(name= "first_name")
	private String firstName ;
	@Column(name= "last_name")
	private String lastName ;
	
	
	public Employee(int id, String eMail, String password, int id2, String firstName, String lastName) {
		super(id, eMail, password);
		id = id2;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

}
