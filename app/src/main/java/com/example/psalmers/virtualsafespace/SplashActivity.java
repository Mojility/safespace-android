package com.example.psalmers.virtualsafespace;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void submitToken(View view) {
        Context context = getApplicationContext();
        String token = ((EditText) findViewById(R.id.token)).getText().toString();
        Intent intent = new Intent(context, RoomListActivity.class);
        context.startActivity(intent);
    }
}
