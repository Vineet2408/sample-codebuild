package com.aws.codebuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/hello")
	public String getMessage() {
		return "hello from aws";
		}
}
