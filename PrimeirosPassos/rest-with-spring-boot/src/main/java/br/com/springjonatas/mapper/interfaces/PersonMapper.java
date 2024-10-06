package br.com.springjonatas.mapper.interfaces;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.springjonatas.model.date.mapstruct.v1.PersonMapStruct;
import br.com.springjonatas.model.entity.PersonEntity;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    
    //Recebe um model e mapeia para um mapper
    PersonMapStruct toPersonMap(PersonEntity person);
    
    //recebe um mapper e mapeia para um model
    PersonEntity toPerson(PersonMapStruct personMap);
    
    //recebe uma lista de mapper e mapeia para um modelo
    List<PersonMapStruct> toPersontMapList(List<PersonEntity> persons);
    
    //recebe uma lista de modelo e mapeia para um mapper para fins de teste unitário
    List<PersonEntity> toPersontList(List<PersonEntity> persons);
}