package br.com.springjonatas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springjonatas.model.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	

}
