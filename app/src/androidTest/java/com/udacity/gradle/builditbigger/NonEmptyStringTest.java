package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by hirensamtani on 27/5/16.
 */
public class NonEmptyStringTest extends AndroidTestCase {

    private static final String LOG_TAG = "NonEmptyStringTest";

    @SuppressWarnings("unchecked")
    public void test() {


        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
