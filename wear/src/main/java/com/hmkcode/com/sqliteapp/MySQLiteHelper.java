package com.hmkcode.com.sqliteapp;

/**
 * Created by MM on 6.4.2015.
 */

 import android.content.ContentValues;
 import android.content.Context;
 import android.database.sqlite.SQLiteDatabase;
 import android.database.sqlite.SQLiteOpenHelper;
 import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

        // Database Version
        private static final int DATABASE_VERSION = 1;
        // Database Name
        private static final String DATABASE_NAME = "SensorDB";

        public MySQLiteHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // SQL statement to create accelometer table
            String CREATE_ACCELOMETER_TABLE = "CREATE TABLE accelometer ( " +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "title TEXT, " +
                    "author TEXT )";

            // create accelometer table
            db.execSQL(CREATE_ACCELOMETER_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older accelometer table if existed
            db.execSQL("DROP TABLE IF EXISTS accelometer");

            // create fresh accelometer table
            this.onCreate(db);
        }

        //edellisen esimerkin mukaan loput taulut

        // Accelometer table name
        private static final String TABLE_ACCELOMETER = "accelometer";

        // Accelometer Table Columns names
        private static final String KEY_ID = "id";
        private static final String KEY_TITLE = "title";
        private static final String KEY_AUTHOR = "author";

        private static final String[] COLUMNS = {KEY_ID,KEY_TITLE,KEY_AUTHOR};

        public void addAccelometer(Accelometer accelometer){
            //for logging
            Log.d("addAccelometer", accelometer.toString());

            // 1. get reference to writable DB
            SQLiteDatabase db = this.getWritableDatabase();

            // 2. create ContentValues to add key "column"/value
            ContentValues values = new ContentValues();
            //values.put(KEY_TITLE, accelometer.getTitle()); // get title
            //values.put(KEY_AUTHOR, accelometer.getAuthor()); // get author

            // 3. insert
            db.insert(TABLE_ACCELOMETER, // table
                    null, //nullColumnHack
                    values); // key/value -> keys = column names/ values = column values

            // 4. close
            db.close();
        }
    }



