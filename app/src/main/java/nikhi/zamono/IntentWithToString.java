package nikhi.zamono;

import android.content.Context;
import android.content.Intent;


/**
 * Created by nikhi on 7/8/17.
 */
public class IntentWithToString extends Intent {
    Class<?> aCls; //variable that holds the value of the class passed to the constructor
    public IntentWithToString(Context packageContext, Class<?> cls)
    {
        super(packageContext, cls);
        aCls = cls;
    }
    @Override
    public String toString()
    {
        return aCls.toString();
    }
}
