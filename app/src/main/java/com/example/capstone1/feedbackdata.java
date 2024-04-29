package com.example.capstone1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class feedbackdata extends SQLiteOpenHelper {
    public feedbackdata(Context context) {
        super(context, "Adminfeed4.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table Feedb(Id Text Primary key,ActivityName Text,Address Text,status Text,statement Text)");
        myDB.execSQL("create Table complaint(Id Text Primary key,Name Text,Address Text,Mobile Text,Complaint Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int i, int i1) {
        myDB.execSQL("drop table if exists Feedb");
        myDB.execSQL("drop table if exists complaint");

    }
    public Boolean insertData2(String Id,String ActivityName, String Address,String status, String statement) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Id",Id);
        contentValues.put("ActivityName",ActivityName);
        contentValues.put("Address",Address);
        contentValues.put("status", status);
        contentValues.put("statement", statement);
        long result = myDB.insert("Feedb", null, contentValues);
        return result != -1;
    }
    public Boolean insertData1(String Id,String Name, String Address, String Mobile, String Complaint) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Id",Id);
        contentValues.put("Name",Name);
        contentValues.put("Address",Address);
        contentValues.put("Mobile",Mobile);
        contentValues.put("Complaint",Complaint);
        long result = myDB.insert("complaint", null, contentValues);
        return result != -1;
    }
    public Cursor getinfo3(String id){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor cursor= myDB.rawQuery("select * from Feedb where Id=? ",new String[]{id});
        return cursor;

    }
    public Cursor getinfo(){
        SQLiteDatabase myDB=this.getWritableDatabase();
        Cursor cursor= myDB.rawQuery("Select * from complaint",null);
        return cursor;

    }
    public Boolean checkId(String Id) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("select * from complaint where Id=?", new String[]{Id});
       // return cursor.getCount() > 0;
         if(cursor.getCount() > 0)
         {
             return true;
         }else {
             return false;
         }
    }

}
