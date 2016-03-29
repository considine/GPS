package com.example.johnpconsidine.transmit;

import android.util.Log;

/**
 * Created by johnpconsidine on 3/28/16.
 */
public class Transmitter {

    // arg1 is the constant, arg2 is what is to be transmitted
    public static void Transmit (String arg1, String arg2) {
        if (arg1.equals("-ble")) {
            Log.v("Transmitter", "ble call made");
        }
        else if (arg1.equals("-network")) {
            Log.v("Transmitter", "network call made");
        }

    }


}
