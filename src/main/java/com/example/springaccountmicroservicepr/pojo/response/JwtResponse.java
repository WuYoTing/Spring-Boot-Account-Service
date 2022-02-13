package com.example.springaccountmicroservicepr.pojo.response;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {

	private String type = "Bearer";
	private String token;
	private String refreshToken;
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

	public JwtResponse(String token, String refreshToken, Long id, String username,
		String email, List<String> roles) {
		this.token = token;
		this.refreshToken = refreshToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
}
