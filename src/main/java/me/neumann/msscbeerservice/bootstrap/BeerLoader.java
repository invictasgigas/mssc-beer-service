package me.neumann.msscbeerservice.bootstrap;

import me.neumann.msscbeerservice.domain.Beer;
import me.neumann.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
            .beerName("Mango Bobs")
            .beerStyle("IPA")
            .quantityToBrew(200)
            .minOnHand(12)
            .upc(535444359L)
            .price(new BigDecimal("12.95"))
            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Flensburger")
                    .beerStyle("Pilsener")
                    .quantityToBrew(500)
                    .minOnHand(33)
                    .upc(535441159L)
                    .price(new BigDecimal("11.15"))
                    .build());
        }

    }
}