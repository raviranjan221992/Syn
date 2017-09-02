package com.jsyntech.institute.trackmee;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

    TextView tv1;
    Button butLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv1=(TextView)findViewById(R.id.text1);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/naft.ttf");
        tv1.setTypeface(face);

        butLogin=(Button)findViewById(R.id.butlog);
        butLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(LoginActivity.this,"You clicked Login button",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LoginActivity.this, ContractListView.class);
                startActivity(intent);
            }
        });

    }
}
