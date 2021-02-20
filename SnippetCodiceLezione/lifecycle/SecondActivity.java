package it.bogliaccino.lifecycle;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondo_layout);
        Toast.makeText(this, "sono la seconda attività",Toast.LENGTH_LONG).show();
    }
}
