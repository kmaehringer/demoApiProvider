package de.websel.demo.api.provider.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/")
	@PreAuthorize("hasAuthority('USER')")
	public Principal resource(Principal principal) {
		return principal;
	}
}
