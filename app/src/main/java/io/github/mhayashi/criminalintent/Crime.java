package io.github.mhayashi.criminalintent;

import java.util.UUID;

/**
 * Created by Masahiro Hayashi on 11/28/14.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
