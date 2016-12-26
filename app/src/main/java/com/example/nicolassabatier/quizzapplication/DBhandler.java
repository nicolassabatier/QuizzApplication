package com.example.nicolassabatier.quizzapplication;

import android.content.Context;
import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Nicolassabatier on 19/12/2016.
 */

public class DBhandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "PlayerInfo";

    // Contacts table name
    private static final String TABLE_NAME= "Userstable";
    private static final String KEY_NAME = "name";
    // Shops Table Columns names
    private static final String KEY_SCORE = "score";
    private static final String CREATE_TABLE="CREATE TABLE"+TABLE_NAME+"("+KEY_NAME +" TEXT" + KEY_SCORE+"INTEGER ,) ";

    private Context context;
    public DBhandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public void addPlayer(Player player) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, player.getName());
        values.put(KEY_SCORE,player.getScore());
        db.insert(TABLE_NAME, null, values);
        db.close(); // Closing database connection



    }

}
