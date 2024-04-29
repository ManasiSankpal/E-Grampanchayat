package com.example.capstone1;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;

import java.time.Period;

public class progress  extends SQLiteOpenHelper {
    public progress(Context context) {
        super(context, "progress1.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {

        myDB.execSQL("create Table ProgressReport( Id Text primary key,ActivityName Text,Location Text,period Text,ActivityDoneBy Text,Amount Text,Status Text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase myDb, int oldversion, int newVersion) {
        myDb.execSQL("drop table if exists ProgressReport");
    }

    public Boolean insertData(String Id, String ActivityName, String Location, String period , String ActivityDoneBy , String Amount,String Status) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Id",Id);
        contentValues.put("ActivityName",ActivityName);
        contentValues.put("Location",Location);
        contentValues.put("period",period);
        contentValues.put("ActivityDoneBy",ActivityDoneBy);
        contentValues.put("Amount",Amount);
        contentValues.put("Status",Status);
        long result = myDB.insert("ProgressReport", null, contentValues);
        return result != -1;
    }
    public Cursor getinfo1(){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor cursor= myDB.rawQuery("Select * from ProgressReport",null);
        return cursor;

    }
}