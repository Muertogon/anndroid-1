package com.corona.coronazp20t;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // atidaromas langas(tuscias, baltas)
        setContentView(R.layout.activity_login); //pridet prie atidaryto lango-vaizda
        //kodas rasomas nuo cia
        Button login= findViewById(R.id.loginid); // susiejamas vaizde esantis elementas su kodu
        final EditText password = findViewById(R.id.passwordid);
        final EditText username = findViewById(R.id.usernameid);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cia rasomas kodas paspaudus mygtuka
                Toast.makeText(LoginActivity.this, "prisijungimo vardas:"+
                        username.getText().toString()+"\n"+"slaptazodis:"+
                        password.getText().toString()+"\n", Toast.LENGTH_SHORT).show();
                // ketinimas pereiti i paieskos langa                is kur                  i kur
                Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                startActivity(goToSearchActivity);
            }
        });

    }


}
