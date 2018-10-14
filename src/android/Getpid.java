package com.terrenprogramming.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Process;

public class Getpid extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("pid")) {

			String needs_ser = data.getString(0);
			String message = "";
			
			if (needs_ser == "true") {
		
            message = "" + android.os.Process.myPid() + "-" + android.os.Process.getStartElapsedRealtime();
			
			} else {
				
            message = "" + android.os.Process.myPid();
				
			}
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}