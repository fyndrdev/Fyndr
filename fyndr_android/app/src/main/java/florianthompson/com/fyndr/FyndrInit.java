package florianthompson.com.fyndr;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;

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

        // Initialize Facebook SDK
        FacebookSdk.sdkInitialize(getApplicationContext());

    }
}
