package com.github.wkennedy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableResourceServer
public class AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
	}

	//curl client:secret@localhost:8080/oauth/token -d grant_type=password -d scope=read -d username=user -d password=pwd -u foo:bar
	@GetMapping(value = {"/user", "/me"})
	public Principal user(Principal user) {
		return user;
	}
}