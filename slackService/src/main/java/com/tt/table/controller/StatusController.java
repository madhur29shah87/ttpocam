package com.tt.table.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tt.table.service.TtService;

@RestController
@RequestMapping("/ttTable")
public class StatusController {
	@Autowired
	private TtService service;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	private ResponseEntity<String> isAlive() {
		return new ResponseEntity<String>("Alive!", HttpStatus.OK);
	}

	@RequestMapping("/status")
	public String getStatus() {
		return service.getTableStatus();
	}
}
