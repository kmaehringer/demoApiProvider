package de.websel.demo.api.provider.controller;

import java.util.UUID;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {

	@PreAuthorize("hasAuthority('FOO_READ')")
	@RequestMapping(method = RequestMethod.GET)
	public String readFoo() {
		return "read foo " + UUID.randomUUID().toString();
	}

	@PreAuthorize("hasAuthority('FOO_WRITE')")
	@RequestMapping(method = RequestMethod.POST)
	public String writeFoo() {
		return "write foo " + UUID.randomUUID().toString();
	}
}
