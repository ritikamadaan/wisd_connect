package com.example.compaq.connect;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

/**
 * Created by Lovish on 12-07-2016.
 */
public class Signhelper extends SQLiteOpenHelper {
    public static final String Dname="sign.db";
    SQLiteDatabase signdb;
    public static final int version=1;
    public static final String Table_name="Users";
    public static final String Fname="Firstname";
    public static final String Lname="Lastname";
    public static final String Phoneno="pno";
    public static final String Password="pwd";
    public Signhelper(Context context)
    {
        super(context,Dname,null, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryTable="Create table "+Table_name+" (  "+Fname+" TEXT NOT NULL, "+Lname+" TEXT NOT NULL, "
                +Phoneno+" REAL PRIMARY KEY, "+Password+" REAL NOT NULL " + ")";
        db.execSQL(queryTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void openDb()
    {
        signdb=getWritableDatabase();
    }
    public void closeDb()
    {
        if(signdb!=null && signdb.isOpen())
            signdb.close();
    }
    public long insert(String FirstN,String LastN,Double phone,Double pass){

        ContentValues values=new ContentValues();
        if(phone!=-1)
        {
            values.put(Fname,FirstN);
            values.put(Lname,LastN);
            values.put(Phoneno,phone);
            values.put(Password,pass);

        }
        return signdb.insert(Table_name,null,values);
    }
    public Cursor getrow()
    {   String query="select * From "+Table_name;
        return signdb.rawQuery(query,null);
    }


  /*  public Cursor getCursor() {

        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder ();

        queryBuilder.setTables(Table_name);

        String [] asColumnsToReturn = new String [] { Password, Phoneno};

        Cursor mCursor = queryBuilder.query(signdb, asColumnsToReturn, null, null, null, null, "Recipe ASC");

        return mCursor;
    }

    public String getName (Cursor c){
        return(c.getString(1));


    }*/

}
