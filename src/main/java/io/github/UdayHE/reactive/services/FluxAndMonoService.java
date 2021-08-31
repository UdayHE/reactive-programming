package io.github.UdayHE.reactive.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class FluxAndMonoService {

    public Flux<String> fruitsFlux() {
        return Flux.fromIterable(Arrays.asList("Mango", "Orange", "Banana")).log();
    }

    public Mono<String> fruitsMono() {
        return Mono.just("Mango").log();
    }

    public static void main(String[] args) {
        FluxAndMonoService fluxAndMonoService = new FluxAndMonoService();

        fluxAndMonoService.fruitsFlux().subscribe(s->{
            System.out.println("flux = "+ s);
        });
        System.out.println("==========MONO=========");
        fluxAndMonoService.fruitsMono().subscribe(s->{
            System.out.println("mono = "+ s);
        });
    }
}
