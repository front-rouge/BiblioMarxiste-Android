package net.bibliomarxiste.bibliothquemarxiste.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

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
