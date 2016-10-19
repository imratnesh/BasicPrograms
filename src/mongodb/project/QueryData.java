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

/**
 *
 * @author Ratnesh
 */
public class QueryData {

    public static void main(String args[]) throws UnknownHostException {
        DB db = (new MongoClient("localhost", 27017)).getDB("mydb");
        DBCollection dbCollection = db.getCollection("Channel");
        BasicDBObject bj = new BasicDBObject();
        bj.put("name", "Ratnesh K");
        DBCursor dbc = dbCollection.find(bj);
        while(dbc.hasNext()){
            System.out.println(dbc.next());
        }
    }
}
