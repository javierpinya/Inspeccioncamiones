package com.javierpinya.inspeccioncamiones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainMenuActivity extends AppCompatActivity {

    Fragment f = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, BuscarActivity.class);
        startActivity(i);

        /*
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedorDashboard, f)
                .commit();


         */
    }


/*
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()){
                case R.id.navigation_dashboard:
                    f = new DashboardFragment();
                    return true;
                case R.id.navigation_profile:
                    f = new ProfileFragment();
                    return true;
                case R.id.navigation_sincronizar:
                    f = new SyncFragment();
                    return true;
            }

            if (f != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedorDashboard, f)
                        .commit();
            }

            return false;
        }
    };

*/
}
