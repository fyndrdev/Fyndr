package florianthompson.com.fyndr_android;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Flo on 15.07.15.
 */
public class FyndrInit extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Initialize Parse DB
        Parse.initialize(this, "7Myq2Ag7jG8Jfb7LJCzi1GloK8yrvJcSujp8di1H", "teRlu4tYrGE3nyJyxDnAcarLg39ZXHVd3nzaJ2jA");


        //test
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();


    }
}
