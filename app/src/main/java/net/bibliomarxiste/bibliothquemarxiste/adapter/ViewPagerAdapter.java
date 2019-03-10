package net.bibliomarxiste.bibliothquemarxiste.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import net.bibliomarxiste.bibliothquemarxiste.fragments.AuthorsFragment;
import net.bibliomarxiste.bibliothquemarxiste.fragments.DocumentsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Fragment[] fragments = {new AuthorsFragment(), new DocumentsFragment()};

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments[position];
    }

    @Override
    public int getCount() {
        return this.fragments.length;
    }
}
