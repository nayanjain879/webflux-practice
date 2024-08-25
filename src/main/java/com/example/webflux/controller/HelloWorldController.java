package com.example.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {
  private static final String HELLO_API = "/hello";
  @GetMapping(HELLO_API)
  public Mono<String> sayHello() {
    return Mono.just("Hello, Reactive World!");
  }

}
