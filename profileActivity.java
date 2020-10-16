package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button bt_mode_list = findViewById(R.id.mode);
        bt_mode_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileActivity.this,ListviewActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openLogout(View view) {
        startActivity(new Intent( profileActivity.this,signupActivity.class));
    }
}