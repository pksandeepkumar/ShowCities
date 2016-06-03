package texus.showcities.utils;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Utility {

    public static String readFromAssets(String filename, Context context) {
        String content = "";

        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(context.getAssets().open(filename))); //throwing a FileNotFoundException?
            String word;
            while((word=br.readLine()) != null)
                content = content  + word;
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close(); //stop reading
            }
            catch(IOException ex) {
                ex.printStackTrace();
            }
        }
        return content;
    }

	public static int parseInt(String number) {
		int num = 0;
		try {
			num = Integer.parseInt(number);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return num;
	}
	
	public static float parseFloat(String number) {
		float num = 0;
		try {
			num = Float.parseFloat(number);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return num;
	}
	
	public static double parseDouble(String number) {
		double num = 0;
		try {
			num = Double.parseDouble(number);
		} catch (Exception e) {
		}
		return num;
	}
	
	public static long parseLong(String number) {
		long num = 0;
		try {
			num = Long.parseLong(number);
		} catch (Exception e) {
		}
		return num;
	}
	
	public static boolean parseBoolean(String value) {
		boolean boolValue = false;
		try {
			boolValue = Boolean.parseBoolean(value.toLowerCase());
		} catch (Exception e) {
		}
		return boolValue;
	}
	

	public static int dpToPx(int dp){
	    return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
	}

	public static int pxToDp(int px){
	    return (int) (px / Resources.getSystem().getDisplayMetrics().density);
	}
	
	
	
}
