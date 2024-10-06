package br.com.springjonatas.unittests.mapper.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.springjonatas.model.date.mapstruct.v1.PersonMapStruct;
import br.com.springjonatas.model.entity.PersonEntity;

public class MockPerson {


    public PersonEntity mockEntity() {
        return mockEntity(0);
    }
    
    public PersonMapStruct mockMapStruct() {
        return mockMapStruct(0);
    }
    
    public List<PersonEntity> mockEntityList() {
        List<PersonEntity> persons = new ArrayList<PersonEntity>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public List<PersonMapStruct> mockMapStructList() {
        List<PersonMapStruct> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockMapStruct(i));
        }
        return persons;
    }
    
    public PersonEntity mockEntity(Integer number) {
        PersonEntity person = new PersonEntity();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setId(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }

    public PersonMapStruct mockMapStruct(Integer number) {
        PersonMapStruct person = new PersonMapStruct();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setId(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }

}
