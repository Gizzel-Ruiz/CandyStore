package com.example.candystore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    private DatabaseManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        dbManager = new DatabaseManager(this);
    }


    public void signin(View view) {
        Intent intentStore = new Intent(SignInActivity.this, StoreActivity.class);
        startActivity(intentStore);
    }

    public void goBack(View v){

        this.finish();
    }
}
