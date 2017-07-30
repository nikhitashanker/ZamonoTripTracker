package nikhi.zamono;

/**
 * Created by nikhi on 7/27/17.
 */


public class Trip {

    private String _startLocation;
    private String _endLocation;
    private String _date;

    public Trip(String startLocation, String endLocation, String date) {
        this._startLocation = startLocation;
        this._endLocation = endLocation;
        this._date = date;
    }



    public void setStartLocation(String startLocation) {
        this._startLocation = startLocation;
    }

    public String getStartLocation() {
        return this._startLocation;
    }

    public void setEndLocation(String endLocation) {
        this._endLocation = endLocation;
    }

    public String getEndLocation() {
        return this._endLocation;
    }

    public void setDate(String date) {
        this._date = date;
    }

    public String getDate() {
        return this._date;
    }
}