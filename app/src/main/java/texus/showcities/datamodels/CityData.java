package texus.showcities.datamodels;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import texus.showcities.json.JsonParserBase;
import texus.showcities.utils.Utility;

/**
 * Created by sandeep on 3/6/16.
 */
public class CityData extends JsonParserBase {

    public String adminCode1 =  "SG";
    public double lng =  9.00138;
    public double distance =  0.61344;
    public long geonameId =  10628563;
    public String toponymName =  "Habrütispitz";
    public String countryId =  "2658434";
    public String fcl =  "T";
    public long population =  0;
    public String countryCode =  "CH";
    public String name =  "Habrütispitz";
    public String fclName =  "mountain,hill,rock,... ";
    public String countryName =  "Switzerland";
    public String fcodeName =  "hill";
    public String adminName1 =  "Saint Gallen";
    public double lat =  47.30544;
    public String fcode =  "HLL";

    public static ArrayList<CityData> getParsed(String jsonString) {
        ArrayList<CityData> objects = new ArrayList<CityData>();
        try {
            JSONObject rootJsonObject = new JSONObject(jsonString);
            JSONArray jsonArray = rootJsonObject.getJSONArray("geonames");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                CityData instance = new CityData();

                instance.adminCode1 = getJsonAttributeValueString(jsonObject, "adminCode1");
                instance.lng = Utility.parseDouble(getJsonAttributeValueString(jsonObject, "lng"));
                instance.distance = Utility.parseDouble(
                        getJsonAttributeValueString(jsonObject, "distance"));
                instance.geonameId = getJsonAttributeValueInt(jsonObject, "geonameId");
                instance.toponymName = getJsonAttributeValueString(jsonObject, "toponymName");
                instance.countryId = getJsonAttributeValueString(jsonObject, "countryId");
                instance.fcl = getJsonAttributeValueString(jsonObject, "fcl");
                instance.population = getJsonAttributeValueInt(jsonObject, "population");
                instance.countryCode = getJsonAttributeValueString(jsonObject, "countryCode");
                instance.name = getJsonAttributeValueString(jsonObject, "name");
                instance.fclName = getJsonAttributeValueString(jsonObject, "fclName");
                instance.countryName = getJsonAttributeValueString(jsonObject, "countryName");
                instance.fcodeName = getJsonAttributeValueString(jsonObject, "fcodeName");
                instance.adminName1 = getJsonAttributeValueString(jsonObject, "adminName1");
                instance.lat = Utility.parseDouble(getJsonAttributeValueString(jsonObject, "lat"));
                instance.fcode = getJsonAttributeValueString(jsonObject, "fcode");

                objects.add(instance);
            }
        } catch ( Exception e){
            e.printStackTrace();
        }
        return objects;
    }

}

//    "geonames": [{
//        "adminCode1": "SG",
//                "lng": "9.00138",
//                "distance": "0.61344",
//                "geonameId": 10628563,
//                "toponymName": "Habrütispitz",
//                "countryId": "2658434",
//                "fcl": "T",
//                "population": 0,
//                "countryCode": "CH",
//                "name": "Habrütispitz",
//                "fclName": "mountain,hill,rock,... ",
//                "countryName": "Switzerland",
//                "fcodeName": "hill",
//                "adminName1": "Saint Gallen",
//                "lat": "47.30544",
//                "fcode": "HLL"
//
//}
