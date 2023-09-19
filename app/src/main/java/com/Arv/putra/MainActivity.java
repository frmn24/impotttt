package com.Arv.putra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private Button btlogin;
    private String usernameco ="kristen";
    private String passwordco ="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        btlogin = findViewById(R.id.btlogin);

        btlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (username.getText().toString().equalsIgnoreCase(usernameco)&&password.getText().toString().equalsIgnoreCase(passwordco)){
                    Intent login = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "Login Berhasil" ,Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Login Gagal" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}