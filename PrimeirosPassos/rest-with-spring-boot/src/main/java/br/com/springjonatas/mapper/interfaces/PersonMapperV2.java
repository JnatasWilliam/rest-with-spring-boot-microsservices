package br.com.springjonatas.mapper.interfaces;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.springjonatas.model.date.mapstruct.v1.PersonMapStruct;
import br.com.springjonatas.model.date.mapstruct.v2.PersonMapStructV2;
import br.com.springjonatas.model.entity.PersonEntity;

@Mapper(componentModel = "spring")
public interface PersonMapperV2 {

    PersonMapperV2 INSTANCE = Mappers.getMapper(PersonMapperV2.class);

    //Recebe um model e mapeia para um mapper
    PersonMapStructV2 toPersonMap(PersonEntity person);
    
    //recebe um mapper e mapeia para um model
    PersonEntity toPerson(PersonMapStructV2 personMap);
    
    //recebe uma lista de mapper e mapeia para um modelo
    List<PersonMapStruct> toPersontMapListV2(List<PersonEntity> persons);
}