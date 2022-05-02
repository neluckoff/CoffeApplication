package com.example.coffeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.coffeapplication.mvvm.viewModels.NewsViewModel;
import com.example.coffeapplication.mvvm.views.MapFragment;
import com.example.coffeapplication.mvvm.views.MenuFragment;
import com.example.coffeapplication.mvvm.views.NewsFragment;
import com.example.coffeapplication.mvvm.views.PersonFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*setContentView(R.layout.fragment_news);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_news, new NewsFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.nav_menu:
                    selectedFragment = new MenuFragment();
                    break;
                case R.id.nav_news:
                    selectedFragment = new NewsFragment();
                    break;
                case R.id.nav_map:
                    selectedFragment = new MapFragment();
                    break;
                case R.id.nav_person:
                    selectedFragment = new PersonFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_news, selectedFragment).commit();
            return true;
        });*/
}