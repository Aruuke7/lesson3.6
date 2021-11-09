package com.example.lesson36;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.lesson36.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

import fragments.AccountFragment;
import fragments.ActionsFragment;
import fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new HomeFragment()).commit();
        initBottomNavigation();
    }

    private void initBottomNavigation() {
        binding.btmNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        setFragment(new HomeFragment());
                        break;
                    case R.id.heart:
                        setFragment(new ActionsFragment());
                        break;
                    case R.id.account:
                        setFragment(new AccountFragment());
                        break;
                }
                return true;
            }
        });
    }
    private void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}