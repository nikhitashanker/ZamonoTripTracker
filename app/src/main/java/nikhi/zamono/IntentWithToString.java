package nikhi.zamono;

import android.content.Intent;
import android.content.Context;


/**
 * Created by nikhi on 7/8/17.
 */
public class IntentWithToString extends Intent {
    Class<?> clsName; //variable that holds the value of the class passed to the constructor
    public IntentWithToString(Context packageContext, Class<?> cls)
    {
        super(packageContext, cls);
        clsName = cls;
    }
    @Override
    public String toString()
    {
        return clsName.toString();
    }
}
