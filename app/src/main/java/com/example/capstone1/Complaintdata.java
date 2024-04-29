package com.example.capstone1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Complaintdata extends SQLiteOpenHelper {
    public Complaintdata(Context context) {
        super(context, "Complaint.db", null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table complaint(Name Text,Address Text,Mobile Text,Complaint)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int i, int i1) {
        myDB.execSQL("drop table if exists complaint");

    }
    public Boolean insertData(String Name, String Address, String Mobile, String Complaint) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name",Name);
        contentValues.put("Address",Address);
        contentValues.put("Mobile",Mobile);
        contentValues.put("Complaint",Complaint);
       long result = myDB.insert("complaint", null, contentValues);
        return result != -1;
    }
    public Cursor getinfo2(){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor cursor= myDB.rawQuery("Select * from complaint",null);
        return cursor;

    }
}
