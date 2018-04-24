package com.example.android.suarezmartialarts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button emailB;


    public void sendEmail() {
        emailB= (Button) findViewById(R.id.emailButton);
        emailB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SENDTO);
                sendEmail.setType("*/*");
                sendEmail.setData(Uri.parse("mailto:dsi28@hotmail.com"));
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Suarez Martial Arts Contact");
                sendEmail.putExtra(Intent.EXTRA_TEXT, "I would like more info please!");
                if(getIntent().resolveActivity(getPackageManager())!= null) startActivity(sendEmail);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendEmail();

    }


}
