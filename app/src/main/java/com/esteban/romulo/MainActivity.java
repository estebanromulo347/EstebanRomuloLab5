package com.esteban.romulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyCustomService.class);
        this.startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.button) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);

        } else if (v.getId() == R.id.button2) {
            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:45.434570, 12.339743"));
            chooser = Intent.createChooser(i, "Select an application");
            startActivity(chooser);


        }
    }

}
