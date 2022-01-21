package com.rellik.vico.LoRi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rellik.vico.R;


public class Register extends AppCompatActivity {

    EditText Username, Password, con_Password;

    public static Boolean snackToast = true;  // Keeping the SnackBar Toast(hints)  of MainActivity Class in  Register class  (sharedPreferences).


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //  Button signUp = findViewById(R.id.sign_up_button);

        getWindow().setStatusBarColor((getResources().getColor(R.color.login_theme)));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.login_theme));

    }


    public void signUp(View view) {

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password_id);
        con_Password = findViewById(R.id.confirm_password_id);


        SharedPreferences spf = getSharedPreferences("login_details", Context.MODE_PRIVATE);
        SharedPreferences.Editor spe = spf.edit();

        spe.putString("username", Username.getText().toString());
        spe.putString("password", Password.getText().toString());
        spe.putString("confirm_password", con_Password.getText().toString());
        spe.putBoolean("SnackToast", snackToast);
        spe.apply();
        condition();


    }


    @SuppressLint("WrongConstant")
    private void condition() {


        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password_id);
        con_Password = findViewById(R.id.confirm_password_id);

        String user = Username.getText().toString();
        String pass = Password.getText().toString();
        String con_pass = con_Password.getText().toString();
        if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(pass) && !TextUtils.isEmpty(con_pass)) {


            if (pass.equals(con_pass)) {
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
                finish();
            } else
                Toast.makeText(this, "Passwords must be same!!", Toast.LENGTH_SHORT).show();


        } else
            Toast.makeText(this, "Enter Sign Up Details", Toast.LENGTH_SHORT).show();


    }
}
