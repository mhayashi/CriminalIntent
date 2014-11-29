package io.github.mhayashi.criminalintent;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Masahiro Hayashi on 11/30/14.
 */
public class Photo {
    private static final String JSON_FILENAME = "filename";

    private String mFilename;

    public Photo(String filename) {
        mFilename = filename;
    }

    public Photo(JSONObject json) throws JSONException {
        mFilename = json.getString(JSON_FILENAME);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_FILENAME, mFilename);
        return json;
    }

    public String getFilename() {
        return mFilename;
    }
}
