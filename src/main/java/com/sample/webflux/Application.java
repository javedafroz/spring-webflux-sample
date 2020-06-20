package com.sample.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.webflux.client.GreetingWebClient;


@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

    GreetingWebClient gwc = new GreetingWebClient();
    System.out.println(gwc.getResult());
  }
}
