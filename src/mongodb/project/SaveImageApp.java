/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb.project;

/**
 *
 * @author Ratnesh
 */
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

/**
 * Java MongoDB : Save image example
 *
 */

public class SaveImageApp {
	public static void main(String[] args) {

		try {

			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("imagedb");
//			DBCollection collection = db.getCollection("dummyColl");

			String newFileName = "mkyong-java-image";

			File imageFile = new File("C:\\Users\\Ratnesh\\Pictures\\p2.jpg");

			// create a "photo" namespace
			GridFS gfsPhoto = new GridFS(db, "photo");

			// get image file from local drive
			GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

			// set a new filename for identify purpose
			gfsFile.setFilename(newFileName);

			// save the image file into mongoDB
			gfsFile.save();

			// print the result
			DBCursor cursor = gfsPhoto.getFileList();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}

			// get image file by it's filename
			GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);

			// save it into a new image file
			imageForOutput.writeTo("C:\\Users\\Ratnesh\\Pictures\\p2New.jpg");

			// remove the image file from mongoDB
			gfsPhoto.remove(gfsPhoto.findOne(newFileName));

			System.out.println("Done");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}