package com.example.capstone1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Decisiondata extends SQLiteOpenHelper {
    public Decisiondata(Context context) {

        super(context, "decisiondata2.db", null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table decesion(Date Text Primary key,Decision Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDb, int i, int i1) {
        myDb.execSQL("drop table if exists decesion");

    }

    public Boolean insertData(String Date, String Decision) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Date", Date);
        contentValues.put("Decision",Decision);
        long result = myDB.insert("decesion", null, contentValues);
        return result != -1;
    }
    public Cursor getinfo2(){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor cursor= myDB.rawQuery("Select * from decesion",null);
        return cursor;

    }
}

