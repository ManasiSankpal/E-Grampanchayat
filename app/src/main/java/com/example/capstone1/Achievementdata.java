package com.example.capstone1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.Date;

public class Achievementdata extends SQLiteOpenHelper {
   /* private static final String achieve2 = "ach";

    private static final String Id = "id";
    private static final String Date = "date";
    private static final String Achievements = "achievements";
*/
    public Achievementdata(Context context) {
        super(context, "Achievement2.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table achieve1(Id Text Primary key,Date  Text,Achievements Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDb, int i, int i1) {
        myDb.execSQL("drop table if exists achieve1");

    }

    public Boolean insertData(String Id, String Date, String Achievements) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Id", Id);
        contentValues.put("Date", Date);
        contentValues.put("Achievements", Achievements);
        long result = myDB.insert("achieve1", null, contentValues);
        return result != -1;
    }

    public Cursor getinfo(){
         SQLiteDatabase myDB=this.getWritableDatabase();
         Cursor cursor= myDB.rawQuery("Select * from achieve1",null);
         return cursor;

     }
   /*public String getData() {
        SQLiteDatabase myDB= this.getReadableDatabase();
        String[] columns = new String[]{Id, Date, Achievements};
        Cursor cursor =myDB.query(achieve2, columns,null,null, null, null, null);

        int iId = cursor.getColumnIndex(Id);
        int iDate = cursor.getColumnIndex(Date);
        int iAchieve = cursor.getColumnIndex(Achievements);
        String res= "";

        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            res = res +
                    "ID: " + cursor.getString(iId) + "\n" +
                    "DATE: " + cursor.getString(iDate) + "\n" +
                    "ACHIEVEMENT: " + cursor.getString(iAchieve) + "\n\n";
        }
        myDB.close();
        return res;
    }*/
}