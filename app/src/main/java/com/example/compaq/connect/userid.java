package com.example.compaq.connect;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Lovish on 13-07-2016.
 */
public class userid extends SQLiteOpenHelper {
    public static final String Dname="user.db";
    SQLiteDatabase userdb;
    public static final int version=1;
    public static final String Table_name="Userinfo";
  //  public static final String Phoneno="Phone Number";
    //public static final String Name="First Name";
    public static final String Level="Level";
    public static final String Field="Field";
    public static final String Cour ="Course";
    public static final String CourType="CourseType";
    public static final String ClasType="ClassType";
    public static final String Place="Place";
    public static final String idno="ID";

    public userid(Context context) {
        super(context, Dname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryTable="Create table "+Table_name+" (  "+Level+" TEXT NOT NULL, "+Field+" TEXT NOT NULL, "
                +Cour+" Text Not Null, "+CourType+" Text NOT NULL, " +ClasType+ "Text Not Null," +Place+ "Text Not Null "+idno+ "Integer Primary Key "+ ")";
        db.execSQL(queryTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long insert( int id,String Lev,String Fie,String Course,String CourTyp,String ClasTyp,String Plac){

        ContentValues values=new ContentValues();
        if(id!=-1)
        {
            values.put(Level,Lev);
            values.put(Field,Fie);
            values.put(Cour,Course);
            values.put(CourType,CourTyp);
            values.put(ClasType,ClasTyp);
            values.put(Place,Plac);

        }
        return userdb.insert(Table_name,null,values);
    }
    public Cursor getrow()
    {   String query="select * From "+Table_name;
        return userdb.rawQuery(query,null);
    }
}
