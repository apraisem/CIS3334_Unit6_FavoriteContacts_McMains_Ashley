package com.example.ashley.cis3334_unit6_favoritecontacts_mcmains_ashley;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1call, btn1text;  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickEvents(); //button events for Tori
        setupButtonClickEvents2(); //button events for Emma
        setupButtonClickEvents3();  //button events for Cassie


    }

    private void setupButtonClickEvents() {

        btn1call = (Button) findViewById(R.id.buttonCall1);
        btn1call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//calling Tori
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel: 2185554425"));
                //check if there is an app to call
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {   // found at least one app to call
                    startActivity(callIntent);  // start that app
                }
            }
        });

        btn1text = (Button) findViewById(R.id.buttonText1);
        btn1text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//texting Tori
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2185554425"));
                sendIntent.putExtra("sms_body", "Hi!");
                startActivity(sendIntent);
            }
        });
    }
    private void setupButtonClickEvents2() {

        btn1call = (Button) findViewById(R.id.buttonCall2);
        btn1call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//calling Emma
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel: 2185551243"));
                //check if there is an app to call
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {   // found at least one app to call
                    startActivity(callIntent);  // start that app
                }
            }
        });

        btn1text = (Button) findViewById(R.id.buttonText2);
        btn1text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//texting Emma
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2185551243"));
                sendIntent.putExtra("sms_body", "Hi!");
                startActivity(sendIntent);
            }
        });
    }
    private void setupButtonClickEvents3() {

        btn1call = (Button) findViewById(R.id.buttonCall3);
        btn1call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//calling Cassie
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel: 2185558981"));
                //check if there is an app to call
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {   // found at least one app to call
                    startActivity(callIntent);  // start that app
                }
            }
        });

        btn1text = (Button) findViewById(R.id.buttonText3);
        btn1text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//texting Cassie
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2185558981"));
                sendIntent.putExtra("sms_body", "Hi!");
                startActivity(sendIntent);
            }
        });
    }
}
