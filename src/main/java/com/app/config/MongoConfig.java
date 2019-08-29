package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "dataStudentV6";
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient( "mongo",27017);
	}
    
	@Override
	protected String getMappingBasePackage() {
		return  "com.app.model";
	}
	

	
	
}
