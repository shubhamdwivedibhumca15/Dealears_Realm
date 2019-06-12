package com.example.dealears_realm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Addbutton,showall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addbutton=findViewById(R.id.addbtn);
        showall=findViewById(R.id.show_Allbtn);


        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i=new Intent(MainActivity.this, AddDealerActivity.class);
                startActivity(i);


            }
        });


        showall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(MainActivity.this,Dealears_Detailes.class);
                startActivity(i);

            }
        });

    }
}
