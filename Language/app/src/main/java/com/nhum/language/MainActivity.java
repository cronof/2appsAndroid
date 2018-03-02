package com.nhum.language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butonEn = (Button)findViewById(R.id.buttonEn);
        butonEn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Configuration config = new Configuration();
                config.locale = Locale.ENGLISH;
                getResources().updateConfiguration(config, null);

                onCreate(null);
            }
        });

        Button butonTh = (Button)findViewById(R.id.butonTh);
        butonTh.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Configuration config = new Configuration();
                config.locale = new Locale("th");
                getResources().updateConfiguration(config, null);

                onCreate(null);
            }
        });
    }
}
