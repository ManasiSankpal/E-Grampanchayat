package com.example.capstone1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class profiledata extends SQLiteOpenHelper {
    public profiledata(Context context) {
        super(context, "Sprofile3.db", null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table adminprofile1(Village Text ,Sarapanchname  Text,Mobileno Text,address Text,sname Text,smobile Text,saddress Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int i, int i1) {
        myDB.execSQL("drop table if exists adminprofile1");

    }

    public Boolean insertData4(String Village , String Sarapanchname , String Mobileno,String address,String sname ,String smobile,String saddress) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Village",Village);
        contentValues.put("Sarapanchname",Sarapanchname);
        contentValues.put("Mobileno",Mobileno);
        contentValues.put("address",address);
        contentValues.put("sname",sname );
        contentValues.put("smobile",smobile);
        contentValues.put("saddress",saddress);
        long result = myDB.insert("adminprofile1", null, contentValues);
        return result != -1;

    }
    public Cursor get1(){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor cursor= myDB.rawQuery("Select * from adminprofile1",null);
        return cursor;

    }

}
