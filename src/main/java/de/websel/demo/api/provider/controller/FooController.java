package de.websel.demo.api.provider.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {

	@RequestMapping(method = RequestMethod.GET)
	public String readFoo() {
		return "read foo " + UUID.randomUUID().toString();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String writeFoo() {
		return "write foo " + UUID.randomUUID().toString();
	}
}
