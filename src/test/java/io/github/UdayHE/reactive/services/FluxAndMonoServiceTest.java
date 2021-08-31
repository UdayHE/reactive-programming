package io.github.UdayHE.reactive.services;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


class FluxAndMonoServiceTest {

    FluxAndMonoService fluxAndMonoService = new FluxAndMonoService();

    @Test
    void fruitsFlux() {
        Flux<String> fruits = fluxAndMonoService.fruitsFlux();
        StepVerifier.create(fruits).expectNext("Mango", "Orange", "Banana").verifyComplete();
    }

    @Test
    void fruitsMono() {
        Mono<String> fruit = fluxAndMonoService.fruitsMono();
        StepVerifier.create(fruit).expectNext("Mango").verifyComplete();
    }

    @Test
    void fruitsFluxMap() {
        Flux<String> fruitsFluxMap = fluxAndMonoService.fruitsFluxMap();
        StepVerifier.create(fruitsFluxMap).expectNext("MANGO", "ORANGE", "BANANA").verifyComplete();
    }
}