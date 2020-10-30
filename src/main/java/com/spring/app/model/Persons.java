package com.spring.app.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Persons {

	@NotNull
	@Size(min = 2,max = 10,message = "Length should not between 2 to 10")
	private String name;
	
	@NotEmpty(message = "Email should not be empty")
	@Email(regexp = "^[A-Za-z0-9_.]{3,}@[A-Za-z]{3,}[.]{1}[A-Za-z.]{2,6}$",message = "Invalid Email pattern")
	private String email;
	
	@NotEmpty(message = "Mobile no should not be empty")
	@Pattern(regexp = "[7-9][0-9]{9}",message = "Invalid mobile number")
	@Size(max = 10,message = "Size sholud not greater than 10 digit")
	private String mobile;
	
	public Persons() {
		// TODO Auto-generated constructor stub
	}

	public Persons(@NotNull @Size(min = 2, max = 10, message = "Length should not between 2 to 10") String name,
			@NotEmpty(message = "Email should not be empty") @Email(regexp = "^[A-Za-z0-9_.]{3,}@[A-Za-z]{3,}[.]{1}[A-Za-z.]{2,6}$", message = "Invalid Email pattern") String email,
			@NotEmpty(message = "Mobile no should not be empty") @Pattern(regexp = "[7-9][0-9]{9}", message = "Invalid mobile number") @Size(max = 10, message = "Size sholud not greater than 10 digit") String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
