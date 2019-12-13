package com.example.RantiMerdekawati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            final int commit = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.quiz:
                            selectedFragment = new QuizFragment();
                            break;
                        case R.id.notif:
                            selectedFragment = new NotificationFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    public void satu(View view) {
        Intent intent = new Intent (this, ganda.class);
        startActivity(intent);
    }

    public void dua(View view) {
        Intent intent = new Intent (this, essay.class);
        startActivity(intent);
    }

    public void final1(View view) {
        Intent intent = new Intent (this, mainangka.class);
        startActivity(intent);
    }

    public void final2(View view) {
        Intent intent = new Intent (this, macambentuk.class);
        startActivity(intent);
    }

    public void final3(View view) {
        Intent intent = new Intent (this, macamwarna.class);
        startActivity(intent);
    }
}
