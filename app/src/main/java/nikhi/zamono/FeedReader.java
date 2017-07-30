package nikhi.zamono;

import android.provider.BaseColumns;
/**
 * Created by nikhi on 7/28/17.
 */

final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN1_NAME_TITLE = "startLocation";
        public static final String COLUMN2_NAME_TITLE = "endLocation";
        public static final String COLUMN3_NAME_TITLE = "date";
        public static final String COLUMN4_NAME_TITLE = "reimb";
        public static final String COLUMN5_NAME_TITLE = "total";



    }
}
