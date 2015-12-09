package net.myanmarlinks.memegenerator;

import android.os.Bundle;
import android.app.Activity;

public class SetupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
