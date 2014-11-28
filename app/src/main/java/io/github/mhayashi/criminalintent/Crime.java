package io.github.mhayashi.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Masahiro Hayashi on 11/28/14.
 */
public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSovled;

    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
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
