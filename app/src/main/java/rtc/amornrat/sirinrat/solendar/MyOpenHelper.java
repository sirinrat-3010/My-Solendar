package rtc.amornrat.sirinrat.solendar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SIRINRAT on 14/1/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    public static final String DATABASE_NAME = "Solendar.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_TODO_TABLE = "create table todoTABLE (" +
            "_id integer primary kay," +
            "Date text, " +
            "ToDo text);";

    public MyOpenHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }//Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(CREATE_TODO_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}// Main Class
