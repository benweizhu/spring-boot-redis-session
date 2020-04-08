package me.zeph.example.spring.springredissessionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringRedisSessionExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringRedisSessionExampleApplication.class, args);
  }

}
