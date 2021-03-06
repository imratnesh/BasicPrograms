//package com.mkyong.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//
//import com.mongodb.MongoClient;
//
//@Configuration
//public class SpringMongoConfig1 {
//
//	public @Bean
//	MongoDbFactory mongoDbFactory() throws Exception {
//		return new SimpleMongoDbFactory(new MongoClient(), "yourdb");
//	}
//
//	public @Bean
//	MongoTemplate mongoTemplate() throws Exception {
//		
//		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
//				
//		return mongoTemplate;
//		
//	}
//
//}
package com.mkyong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

/**
 * Spring MongoDB configuration file
 * 
 */
@Configuration
public class SpringMongoConfig1{

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("127.0.0.1"),"mydb");
		return mongoTemplate;
		
	}
		
}