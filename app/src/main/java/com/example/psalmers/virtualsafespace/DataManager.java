package com.example.psalmers.virtualsafespace;

import android.content.Context;

/**
 * Created by psalmers on 2017-03-25.
 */

public class DataManager {
    private static DataManager ourInstance;

    public static DataManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new DataManager();
        }

        return ourInstance;
    }


}
