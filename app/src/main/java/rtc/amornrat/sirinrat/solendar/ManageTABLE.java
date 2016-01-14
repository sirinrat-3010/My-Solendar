package rtc.amornrat.sirinrat.solendar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by SIRINRAT on 14/1/2559.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase , readSqLiteDatabase;

    public ManageTABLE(Context context) {


        //Conneced Databese
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();


    }//Constructor
}//Main class
