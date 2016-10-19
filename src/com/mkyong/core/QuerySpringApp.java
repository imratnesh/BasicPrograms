package com.mkyong.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.mkyong.config.SpringMongoConfig;
import com.mkyong.config.SpringMongoConfig1;
import com.mkyong.model.User1;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Query example
 * 
 * @author mkyong
 * 
 */

public class QuerySpringApp {

	public static void main(String[] args) {
		// For Annotation
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig1.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

                
		// insert 6 users for testing
		List<User1> users = new ArrayList<>();

		User1  user1 = new User1("1001", "ant", 10);
		User1  user2 = new User1("1002", "bird", 20);
		User1  user3 = new User1("1003", "cat", 30);
		User1  user4 = new User1("1004", "dog", 40);
		User1  user5 = new User1("1005", "elephant",50);
		User1  user6 = new User1("1006", "frog", 60);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		mongoOperation.insert(users, User1.class);

		System.out.println("Case 1 - find with BasicQuery example");

		BasicQuery query1 = new BasicQuery("{ age : { $lt : 40 }, name : 'cat' }");
		User1  userTest1 = mongoOperation.findOne(query1, User1.class);

		System.out.println("query1 - " + query1.toString());
		System.out.println("userTest1 - " + userTest1);

		System.out.println("\nCase 2 - find example");

		Query query2 = new Query();
		query2.addCriteria(Criteria.where("name").is("dog").and("age").is(40));

		User1  userTest2 = mongoOperation.findOne(query2, User1.class);
		System.out.println("query2 - " + query2.toString());
		System.out.println("userTest2 - " + userTest2);

		System.out.println("\nCase 3 - find list $inc example");

		List<Integer> listOfAge = new ArrayList<>();
		listOfAge.add(10);
		listOfAge.add(30);
		listOfAge.add(40);

		Query query3 = new Query();
		query3.addCriteria(Criteria.where("age").in(listOfAge));

		List<User1> userTest3 = mongoOperation.find(query3, User1.class);
		System.out.println("query3 - " + query3.toString());

		for (User1  user : userTest3) {
			System.out.println("userTest3 - " + user);
		}

		System.out.println("\nCase 4 - find list $and $lt, $gt example");

		Query query4 = new Query();

		// Due to limitations of the com.mongodb.BasicDBObject,
		// you can't add a second 'age' expression specified as 'age : { "$gt" :
		// 10}'. Criteria already contains 'age : { "$lt" : 40}'.
		// query4.addCriteria(Criteria.where("age").lt(40).and("age").gt(10));

		query4.addCriteria(Criteria.where("age").lt(40).andOperator(Criteria.where("age").gt(10)));

		List<User1> userTest4 = mongoOperation.find(query4, User1.class);
		System.out.println("query4 - " + query4.toString());

		for (User1  user : userTest4) {
			System.out.println("userTest4 - " + user);
		}

		System.out.println("\nCase 5 - find list and sorting example");
		Query query5 = new Query();
		query5.addCriteria(Criteria.where("age").gte(30));
		query5.with(new Sort(Sort.Direction.DESC, "age"));

		List<User1> userTest5 = mongoOperation.find(query5, User1.class);
		System.out.println("query5 - " + query5.toString());

		for (User1  user : userTest5) {
			System.out.println("userTest5 - " + user);
		}

		System.out.println("\nCase 6 - find by regex example");
		Query query6 = new Query();
		query6.addCriteria(Criteria.where("name").regex("D.*G", "i"));

		List<User1> userTest6 = mongoOperation.find(query6, User1.class);
		System.out.println("query6 - " + query6.toString());

		for (User1  user : userTest6) {
			System.out.println("userTest6 - " + user);
		}

		mongoOperation.dropCollection(User1.class);

	}

}
