package com.rellik.vico.LoRi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rellik.vico.MainActivity;
import com.rellik.vico.R;


public class login extends AppCompatActivity {


    EditText Username, Password;
    public static String PREFS_NAME = "MyPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        getWindow().setStatusBarColor((getResources().getColor(R.color.login_theme)));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.login_theme));


        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("hasLoggedIn", true);
        editor.apply();



    }


    public void Login(View view) {

        SharedPreferences spf = getSharedPreferences("login_details", Context.MODE_PRIVATE);
        String Username_id = spf.getString("username", "no value");
        String password_id = spf.getString("password", "no value");

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.signIn_password);

        String user = Username.getText().toString();
        String pass = Password.getText().toString();

        if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(pass)) {

            if (user.equals(Username_id) && pass.equals(password_id)) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(login.this, MainActivity.class);
                startActivity(i);
                finish();

            } else
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();

        } else
            Toast.makeText(this, "Enter login Details", Toast.LENGTH_SHORT).show();
    }



    public void signUp(View view) {
        Intent signUp = new Intent(login.this, Register.class);
        startActivity(signUp);
    }


    public void forgetPassword(View view) {
        Toast.makeText(this, "Just Sign Up Again", Toast.LENGTH_SHORT).show();
        Intent forget_Password = new Intent(login.this, Register.class);
        startActivity(forget_Password);
    }


}