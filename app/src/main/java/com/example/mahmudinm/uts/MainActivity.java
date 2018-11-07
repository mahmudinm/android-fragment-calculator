package com.example.mahmudinm.uts;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.media_fragment, new FirstFragment())
                .commit();

        BottomNavigationView nav = (BottomNavigationView) findViewById(R.id.nav_menu);
        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment pilihan = null ;

                switch (item.getItemId()) {
                    case R.id.first:
                        pilihan = new FirstFragment();
                        break;
                    case R.id.second:
                        pilihan = new SecondFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.media_fragment, pilihan)
                        .commit();
                return true;
            }
        });


    }
}
