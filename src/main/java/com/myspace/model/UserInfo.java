package com.myspace.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
@Data
public class UserInfo {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer userID;
		private String firstName;
	    private String lastName;
		private Integer phoneNumber;
		private Date dateOfBirth;
		private String gender;
	    private String pass;
		private String roles;
//	    private List<Address> address;
}
