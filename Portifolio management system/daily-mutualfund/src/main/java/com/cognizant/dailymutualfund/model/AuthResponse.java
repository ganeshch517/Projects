package com.cognizant.dailymutualfund.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AuthResponse {

	private String userId;

	private String userName;

	private boolean isValid;

	

}
