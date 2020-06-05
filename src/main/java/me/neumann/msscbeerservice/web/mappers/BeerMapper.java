package me.neumann.msscbeerservice.web.mappers;

import me.neumann.msscbeerservice.domain.Beer;
import me.neumann.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
