
package br.com.brunojs.vendas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.brunojs.vendas.repository")
public class MongoConfig {

}
