package net.bibliomarxiste.bibliothquemarxiste;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import net.bibliomarxiste.bibliothquemarxiste.fragments.AuthorsFragment;
import net.bibliomarxiste.bibliothquemarxiste.fragments.DocumentsFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.loadFragment(new AuthorsFragment());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment == null) return false;
        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@Nullable MenuItem item) {
        Fragment fragment = null;

        if (item == null) return false;

        switch (item.getItemId()) {
            case R.id.bottom_navigation_authors:
                fragment = new AuthorsFragment();
                break;

            case R.id.bottom_navigation_documents:
                fragment = new DocumentsFragment();
                break;

            default:
                break;
        }
        return this.loadFragment(fragment);
    }
}
