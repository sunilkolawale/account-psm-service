package com.psm.account.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

	private String userName;
	private String userEmail;
	private String userPassword;

}
