package com.myspace.model;

import java.util.List;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class UserDetail {

	private String name;
	private String id;
	private String city;
	private String phone;
	private List<Address> address;

}
