package me.zeph.example.spring.springredissessionexample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfiguration {


  @ConfigurationProperties(prefix = "spring.redis")
  @Bean
  public RedisStandaloneConfiguration redisStandaloneConfiguration() {
    return new RedisStandaloneConfiguration();
  }

  @Bean
  public JedisConnectionFactory redisConnectionFactory(RedisStandaloneConfiguration redisStandaloneConfiguration) {
    return new JedisConnectionFactory(redisStandaloneConfiguration);
  }
}
