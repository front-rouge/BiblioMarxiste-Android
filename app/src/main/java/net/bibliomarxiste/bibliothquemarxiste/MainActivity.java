package net.bibliomarxiste.bibliothquemarxiste;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import net.bibliomarxiste.bibliothquemarxiste.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener, ViewPager.OnPageChangeListener {
    BottomNavigationView navigation;
    private ViewPager viewPager;
    private MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        //this.loadFragment(new AuthorsFragment());
        this.viewPager = findViewById(R.id.fragment_container);
        this.viewPager.setAdapter(new ViewPagerAdapter(this.getSupportFragmentManager()));
        this.viewPager.addOnPageChangeListener(this);

        this.navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@Nullable MenuItem item) {
        Fragment fragment = null;

        if (item == null) {
            return false;
        }

        switch (item.getItemId()) {
            case R.id.bottom_navigation_authors:
                viewPager.setCurrentItem(0);
                break;

            case R.id.bottom_navigation_documents:
                viewPager.setCurrentItem(1);
                break;

            default:
                break;
        }
        return false;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (this.prevMenuItem != null) {
            prevMenuItem.setChecked(false);
        } else {
            this.navigation.getMenu().getItem(0).setChecked(false);
        }
        this.prevMenuItem = this.navigation.getMenu().getItem(position);
        this.prevMenuItem.setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
