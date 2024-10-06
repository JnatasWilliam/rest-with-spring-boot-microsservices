package br.com.springjonatas.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springjonatas.model.date.mapstruct.v1.PersonMapStruct;
import br.com.springjonatas.services.PersonServices;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {

	private PersonServices service;
	
	public PersonController(PersonServices service){
		this.service = service;
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonMapStruct findById(@PathVariable(value = "id") Long id) throws Exception {

		return service.findById(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PersonMapStruct> findAll() {

		return service.findAll();
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PersonMapStruct create(@RequestBody PersonMapStruct PersonMapper) {

		return service.create(PersonMapper);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {

		service.delete(id);
		
		return ResponseEntity.noContent().build();
	}
}
