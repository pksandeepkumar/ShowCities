package texus.showcities;

import android.app.Application;

/**
 * Created by sandeep on 3/6/16.
 */
public class ShowCitiesApp extends Application {

//    http://api.geonames.org/findNearbyJSON?lat=47.3&lng=9&username=akhiljayaram&radius=300

    public static String baseURL = "http://api.geonames.org/findNearbyJSON?";



    private static ShowCitiesApp ourInstance = new ShowCitiesApp();

    public static ShowCitiesApp getInstance() {
        return ourInstance;
    }

//    private ShowCitiesApp() {
//
//    }

    @Override
    public void onCreate() {
        super.onCreate();
        ourInstance = this;
    }


}
