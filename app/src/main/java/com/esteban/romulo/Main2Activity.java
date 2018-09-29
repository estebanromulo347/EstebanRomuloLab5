package com.esteban.romulo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyCustomService.class);
        this.startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.button6) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

        } else if (v.getId() == R.id.button2) {
            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:41.403666, 2.174426"));
            chooser = Intent.createChooser(i, "Select an application");
            startActivity(chooser);


        }
    }

}
