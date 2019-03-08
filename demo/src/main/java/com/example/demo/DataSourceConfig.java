package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {
	@Bean(name="datasource-url")
	@Profile("development")
	public String devDataSource() {
		return "url-data-source-dev";
	}
	@Bean(name="datasource-url")
	@Profile("production")
	public String prodDataSource() {
		return "url-data-source-prod";
	}
}