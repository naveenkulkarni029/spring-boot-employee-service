package org.nbk.demo.employees.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@EnableAutoConfiguration
@ComponentScan
public class EmployeeAppConfig {

	 @Bean
	    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MongoMappingContext context) {
	 
	        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
	        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
	 
	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);
	 
	        return mongoTemplate;	     
	}
}