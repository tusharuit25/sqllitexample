package com.twigsoftwares.sqlliteexample;

import android.database.sqlite.SQLiteOpenHelper;

import com.clough.android.androiddbviewer.ADBVApplication;

public class CustomApplication extends ADBVApplication {
    @Override
    public SQLiteOpenHelper getDataBase() {
        return new DatabaseHandler(getApplicationContext());
    }
}
