package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer extends User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id ;
	@Column(name = "company_name")
	private String companyName ;
	@Column(name = "website")
	private String website ;
	@Column(name = "phone_number")
	private int phoneNumber ;
	
	
	
	public Employer(int id, String eMail, String password, int id2, String company_name, String website,
			int phoneNumber) {
		super(id, eMail, password);
		id = id2;
		this.companyName = company_name;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}

}











