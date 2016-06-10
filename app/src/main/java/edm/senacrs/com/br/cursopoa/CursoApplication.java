package edm.senacrs.com.br.cursopoa;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by gaspar on 10/06/16.
 */
public class CursoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
