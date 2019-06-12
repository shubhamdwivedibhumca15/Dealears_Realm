package com.example.dealears_realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddDealerActivity extends AppCompatActivity {

    EditText d_id,d_name,d_phone,d_address;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__dealears);

        d_id=findViewById(R.id.d_id);
        d_name=findViewById(R.id.dname);
        d_phone=findViewById(R.id.d_phone);
        d_address=findViewById(R.id.d_address);

        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String id=d_id.getText().toString();
                String dname=d_name.getText().toString();
                String dphone=d_phone.getText().toString();
                String daddress=d_address.getText().toString();


                if (TextUtils.isEmpty(id)) {

                    Toast.makeText(AddDealerActivity.this, "Enter dealears id", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(dname)) {
                    Toast.makeText(AddDealerActivity.this, "Enter dealears name", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(dphone)) {
                    Toast.makeText(AddDealerActivity.this, "Enter dealears Phone", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(daddress)) {
                    Toast.makeText(AddDealerActivity.this, "Enter dealears Address" +
                            "", Toast.LENGTH_LONG).show();
                    return;
                }

                Dealears_Model dealears_model = new Dealears_Model();
                dealears_model.setD_address(daddress);
                dealears_model.setD_name(dname);
                dealears_model.setD_phone(dphone);


              boolean success =   Realm_Helper.savedealears(dealears_model);
              if (success){
                  Toast.makeText(AddDealerActivity.this,"Saved successfully",Toast.LENGTH_LONG).show();
              }else{
                  Toast.makeText(AddDealerActivity.this, "Failed to save", Toast.LENGTH_SHORT).show();
              }


            }
        });
    }
}
