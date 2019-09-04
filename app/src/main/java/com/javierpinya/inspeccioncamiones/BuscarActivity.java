package com.javierpinya.inspeccioncamiones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BuscarActivity extends AppCompatActivity {

    Fragment f = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()) {
                case R.id.navigation_firstcomponent:
                    f = new BuscarFragment();
                    return true;
                case R.id.navigation_secondcomponent:
                    f = new BuscarFragment();
                    return true;
                case R.id.navigation_conjunto:
                    f = new BuscarFragment();
                    return true;
            }

            if (f != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedorVehiculo, f)
                        .commit();
            }
            return false;
        }
    };

}
