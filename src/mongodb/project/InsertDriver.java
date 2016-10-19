/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb.project;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Ratnesh
 */
public class InsertDriver {

    public static void main(String args[]) throws UnknownHostException {
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//        List<String> databases = mongoClient.getDatabaseNames();
//        for (String dbName : databases) {
//            System.out.println("- Database: " + dbName);
//            
//            DB db = mongoClient.getDB(dbName);
//            
//            Set<String> collections = db.getCollectionNames();
//            for (String colName : collections) {
//                System.out.println("\t + Collection: " + colName);
//            }
//        }
//        mongoClient.close();
        DB db = (new MongoClient("localhost", 27017)).getDB("testdb");
//        DBCollection dbCollection = db.getCollection("website");
//        BasicDBObject bj = new BasicDBObject();
//        bj.put("name", "Ratnesh Kk");
//        bj.put("subscription", 4001);
//        dbCollection.insert(bj);
//        Set<String> tables = db.getCollectionNames();
//
//        for (String coll : tables) {
//            System.out.println(coll);
//        }
//
//        DBCollection table = db.getCollection("user");
//        BasicDBObject document = new BasicDBObject();
//        document.put("name", "mkyong");
//        document.put("age", 30);
//        document.put("createdDate", new Date());
//        table.insert(document);
//DBCollection table = db.getCollection("user");

//        BasicDBObject query = new BasicDBObject();
//        query.put("name", "mkyong");
//
//        BasicDBObject newDocument = new BasicDBObject();
//        newDocument.put("name", "mkyong-updated");
//
//        BasicDBObject updateObj = new BasicDBObject();
//        updateObj.put("$set", newDocument);
//
//        table.update(query, updateObj);
//
//        BasicDBObject searchQuery = new BasicDBObject();
//        searchQuery.put("name", "mkyong");
//
//        DBCursor cursor = table.find(searchQuery);
//
//        while (cursor.hasNext()) {
//            System.out.println(cursor.next());
//        }
//
//        table.remove(searchQuery);
        DBCollection table = db.getCollection("user");

        BasicDBObject document = new BasicDBObject();
        document.put("name", "mkyong");
        table.insert(document);
    }

}
