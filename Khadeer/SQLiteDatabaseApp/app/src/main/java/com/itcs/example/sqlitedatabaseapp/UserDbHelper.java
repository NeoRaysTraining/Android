package com.itcs.example.sqlitedatabaseapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by khussain on 4/21/2016.
 */
public class UserDbHelper extends SQLiteOpenHelper
{
    private static  final  String DATABASE_NAME="USERINFO.DB";
    private static  final  int DATABASE_VERSION=1;
    private static  final  String CREATE_QUERY = " CREATE TABLE " + UserContract.NewUserInfo.TABLE_NAME + " ( " + UserContract.NewUserInfo.USER_NAME + " TEXT , " + UserContract.NewUserInfo.USER_MOB + " TEXT , " + UserContract.NewUserInfo.USER_EMAIL + " TEXT );";

    public  UserDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS", "Database Created/Opened");
    }

    @Override
    public  void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS","TABLE CREATED...");
    }

    //code to insert data in database

    public  void  addInformations(String name,String mob,String email,SQLiteDatabase db)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put(UserContract.NewUserInfo.USER_NAME,name);
        contentValues.put(UserContract.NewUserInfo.USER_MOB,mob);
        contentValues.put(UserContract.NewUserInfo.USER_EMAIL,email);
        db.insert(UserContract.NewUserInfo.TABLE_NAME,null,contentValues);
        Log.e("Database Operations","one row inserted....");
    }

    // code to read data from database

    public Cursor getInformations(SQLiteDatabase db)
    {
        Cursor cursor;
        String[] projections={UserContract.NewUserInfo.USER_NAME,UserContract.NewUserInfo.USER_MOB,UserContract.NewUserInfo.USER_EMAIL};
        cursor=db.query(UserContract.NewUserInfo.TABLE_NAME,projections,null,null,null,null,null);
        return cursor;
    }

    //code to search values

    public Cursor getContact(String user_name,SQLiteDatabase sqLiteDatabase)
    {
        String[] projections={UserContract.NewUserInfo.USER_MOB,UserContract.NewUserInfo.USER_EMAIL};
        String selection=UserContract.NewUserInfo.USER_NAME+ " LIKE ? "; //its a where clause condition
        String[] selection_args={user_name};
        Cursor cursor= sqLiteDatabase.query (UserContract.NewUserInfo.TABLE_NAME,projections,selection,selection_args,null,null,null);
        return cursor;
    }

    //code to delete contact

    public  void  deleteInformation(String user_name,SQLiteDatabase sqLiteDatabase)
    {
        String selection=UserContract.NewUserInfo.USER_NAME+ " LIKE ? ";
        String[] selection_args={user_name};
        sqLiteDatabase.delete(UserContract.NewUserInfo.TABLE_NAME,selection,selection_args);
    }

    //code to update the contact values

    public  int updateInformation(String old_name,String new_name,String new_mobile,String new_email,SQLiteDatabase sqLiteDatabase)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put(UserContract.NewUserInfo.USER_NAME,new_name);
        contentValues.put(UserContract.NewUserInfo.USER_MOB,new_mobile);
        contentValues.put(UserContract.NewUserInfo.USER_EMAIL,new_email);
        String selection=UserContract.NewUserInfo.USER_NAME + " LIKE ? ";
        String[] selection_args = {old_name};
        int count=sqLiteDatabase.update(UserContract.NewUserInfo.TABLE_NAME,contentValues,selection,selection_args);
        return  count;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
