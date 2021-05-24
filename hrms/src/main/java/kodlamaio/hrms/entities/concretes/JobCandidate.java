package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_candidates")
public class JobCandidate extends User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id ;
	@Column(name ="first_name")
	private String firstName ;
	@Column(name = "last_name")
	private String lastName ;
	@Column(name = "identity_number")
	private String identityNumber ;
	@Column(name = "birth_day")
	private String birthDay ;

	public JobCandidate(int id, String eMail, String password, int id2, String firstName, String lastName,
			String identityNumber, String birthDay) {
		super(id, eMail, password);
		id = id2;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDay = birthDay;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
