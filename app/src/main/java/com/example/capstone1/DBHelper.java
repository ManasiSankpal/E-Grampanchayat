package com.example.capstone1;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;

import java.time.Period;

public class DBHelper  extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "userdata1.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table users( Email Text primary key,password Text)");
         }
    @Override
    public void onUpgrade(SQLiteDatabase myDb, int oldversion, int newVersion) {
        myDb.execSQL("drop table if exists users");
        }
    public Boolean insertData( String Email, String Password) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Email", Email);
        contentValues.put("password", Password);

        long result = myDB.insert("users", null, contentValues);

        return result != -1;
    }

    public Boolean checkEmail(String Email) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("select * from users where Email=?", new String[]{Email});
        return cursor.getCount() > 0;
    }

    public Boolean checkEmailPassword(String Email, String Password) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("select * from users where Email=? and password=?", new String[]{Email, Password});
        return cursor.getCount() > 0;
    }

    public int updatepass(String Email, String new_pass) {
        SQLiteDatabase myDB = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("password", new_pass);
        return myDB.update("users", contentValues, "Email=?", new String[]{Email});
    }


    }
