package com.ddy.EatFood.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.ddy.EatFood.Model.Entity")
public class JpaConfiguration {
}
