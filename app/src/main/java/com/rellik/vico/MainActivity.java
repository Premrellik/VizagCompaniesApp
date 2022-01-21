package com.rellik.vico;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.app.AlertDialog;

import android.content.Intent;

import android.os.Bundle;

import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.rellik.vico.Companies.*;
import com.rellik.vico.LoRi.*;
import java.text.DateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    NavigationView navView;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    SwitchCompat aSwitch;

    int count = 0;

    TextView date;

    Boolean snackEnable = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        {

            Calendar calendar = Calendar.getInstance();
            String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
            date = findViewById(R.id.date);
            date.setText(currentDate);
        }

        /*--------- Hooks  -----------*/
        navView = findViewById(R.id.nav);
        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        aSwitch = findViewById(R.id.switch2);


        if (Register.snackToast) {
            aSwitch.setChecked(true);
            snackEnable = true;
        }


        aSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (aSwitch.isChecked()) {
                snackEnable = true;
            } else {
                snackEnable = false;
            }
             Register.snackToast = snackEnable;   // Keeping the SnackBar Toast in sharedPreferences in  Register class
        });


        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Software()).commit();

        /*-------Tool BAR----------*/
        setSupportActionBar(toolbar);

        /*----- action bar Toggle  -----*/
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navView.bringToFront();
        navView.setCheckedItem(R.id.menu_home);
        navView.setNavigationItemSelectedListener(this);


    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment Temp;
        int i = menuItem.getItemId();


        switch (i) {

            case R.id.menu_home:
                Temp = new Software();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Temp).commit();
                if (snackEnable)
                    Snackbar.make(drawerLayout,  "33 Companies", Snackbar.LENGTH_SHORT).setDuration(1500).show();


                break;


            case R.id.privat:
                Temp = new Private();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Temp).commit();
                if (snackEnable)
                    Snackbar.make(drawerLayout, "6 Companies", Snackbar.LENGTH_SHORT).setDuration(1500).show();

                break;


            case R.id.goverment:
                Temp = new Government();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Temp).commit();
                if (snackEnable)
                    Snackbar.make(drawerLayout, "4 Companies", Snackbar.LENGTH_SHORT).setDuration(1500).show();

                break;


            case R.id.college:
                Temp = new College();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Temp).commit();
                if (snackEnable)
                    Snackbar.make(drawerLayout, "51 Companies", Snackbar.LENGTH_SHORT).setDuration(1500).show();

                break;


            case R.id.menu_about:
                Temp = new About();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Temp).commit();
                break;


            case R.id.menu_share:
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String shareBody = "Download this App:  https://play.google.com/store/apps/details?id=com.rellik.vico";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(shareIntent, "share via"));

                } catch (Exception e) {
                    Toast.makeText(this, "Error occurred", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.signout:

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Sign Out");
                builder.setMessage("Do you want to exit the app?");

                builder.setPositiveButton("Yes", (dialog, which) -> {
                    Intent singOut = new Intent(MainActivity.this, login.class);
                    MainActivity.this.startActivity(singOut);
                    MainActivity.this.finish();
                });

                builder.setNegativeButton("No", (dialog, which) -> dialog.dismiss());
                builder.create().show();

                break;


            default:
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        navView.setCheckedItem(menuItem.getItemId());
        return true;


    }


    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

        } else {
            count++;

            if (count == 1)
                Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();

            else if (count > 1) {
                super.onBackPressed();
                finish();
            }


        }
    }


}
