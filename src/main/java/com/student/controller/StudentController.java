package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.exception.SillyException;
//Testing124
@RestController
public class StudentController {

	@GetMapping("/")
	public String hi() throws SillyException {
	throw new SillyException("Too much silliness");
		}
}
