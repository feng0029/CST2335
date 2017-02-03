package com.example.fhx20.androidlabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;

public class StartActivity extends AppCompatActivity {
    protected static final String ACTIVITY_NAME = "StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btToListItems =(Button)findViewById(R.id.button);

        btToListItems .setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View view) {
//               SharedPreferences sharedPref = getSharedPreferences(
//                        "LoginFile", Context.MODE_PRIVATE);
//                SharedPreferences.Editor edit = sharedPref.edit();

                Intent ListItemsActivity  = new Intent(StartActivity.this, ListItemsActivity.class);
                //startActivity(intent);
                startActivityForResult(ListItemsActivity ,5);


            }
        });

//        setContentView(R.layout.activity_start);
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }

    public void onActivityResult(int requestCode,int responseCode, Intent data){
        if( requestCode == 5){
            Log.i(ACTIVITY_NAME, "Returned to StartActivity.onActivityResult");
            }

        if(responseCode== Activity.RESULT_OK) {
            String messagePassed = data.getStringExtra("Response");
            Toast toast = Toast.makeText(this , messagePassed, Toast.LENGTH_LONG);
            toast.show(); //display your message box
            }
        }



    protected void onResume()
    {
        super.onResume();
        Log.i(ACTIVITY_NAME, "In OnResume()");
    }

    protected void onStart()
    {
        super.onStart();
        Log.i(ACTIVITY_NAME, "In OnStart()");
    }

    protected void onPause()
    {
        super.onPause();
        Log.i(ACTIVITY_NAME, "In onPause()");
    }

    protected void onStop()
    {
        super.onStop();
        Log.i(ACTIVITY_NAME, "In onStop()");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(ACTIVITY_NAME, "In onDestroy()");
    }

}
