package nikhi.zamono;


import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MyActivity extends ListActivity {

    private ArrayList<String> results = new ArrayList<String>();
    private String tableName = FeedReaderContract.FeedEntry.TABLE_NAME;
    private Button maps;
    private SQLiteDatabase newDB;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openAndQueryDatabase();
        maps = (Button) findViewById(R.id.maps_button);

        displayResultList();




    }

    private void displayResultList() {
        TextView tView = new TextView(this);
        tView.setTextSize(30);
        tView.setText("Your Drives:");
        getListView().addHeaderView(tView);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, results));
        getListView().setTextFilterEnabled(true);

    }
    private void openAndQueryDatabase() {
        try {
            FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(getApplicationContext());
            newDB = mDbHelper.getWritableDatabase();
            Cursor c = newDB.rawQuery("select * from " + tableName, null);

            if (c != null ) {
                if (c.moveToFirst()) {
                    do {
                        String startLocation = c.getString(c.getColumnIndex("startLocation"));
                        String endLocation = c.getString(c.getColumnIndex("endLocation"));
                        String date = c.getString(c.getColumnIndex("date"));
                        double reimbursement = c.getDouble(c.getColumnIndex("reimb"));
                        double total = c.getDouble(c.getColumnIndex("total"));

                        results.add("FROM: " + startLocation + "\n TO: " + endLocation + "\n DATE: " + date + "\n LOGGED: $" + reimbursement +
                                "\n TOTAL: $" + total);

                    }while (c.moveToNext());
                }
            }
        } catch (SQLiteException se ) {
            Log.e(getClass().getSimpleName(), "Could not create or Open the database");
        } finally {
            if (newDB != null)
                newDB.execSQL("DELETE FROM " + tableName);
            newDB.close();
        }

    }

}