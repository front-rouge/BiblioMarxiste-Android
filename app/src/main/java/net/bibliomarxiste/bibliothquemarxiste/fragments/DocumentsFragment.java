package net.bibliomarxiste.bibliothquemarxiste.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import net.bibliomarxiste.bibliothquemarxiste.R;
import net.bibliomarxiste.bibliothquemarxiste.adapter.ImgAdapter;
import net.bibliomarxiste.bibliothquemarxiste.utils.Item;

import java.util.ArrayList;

public class DocumentsFragment extends Fragment {
    private GridView gridView;
    private ArrayList<Item> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.documents_fragment, null);

        this.gridView = (GridView) view;
        this.itemList = new ArrayList<>();
        this.populateGrid();

        this.gridView.setAdapter(new ImgAdapter(this.getContext(), this.itemList, 500, 350));

        return view;
    }

    private void populateGrid() {
        this.itemList.add(new Item(R.drawable.afghanistan, "afghanistan"));
        this.itemList.add(new Item(R.drawable.allemagne, "allemagne"));
        this.itemList.add(new Item(R.drawable.bresil, "bresil"));
        this.itemList.add(new Item(R.drawable.canada, "canada"));
        this.itemList.add(new Item(R.drawable.chine, "chine"));
        this.itemList.add(new Item(R.drawable.usa, "usa"));
        this.itemList.add(new Item(R.drawable.france, "france"));
        this.itemList.add(new Item(R.drawable.inde, "inde"));
        this.itemList.add(new Item(R.drawable.italie, "italie"));
        this.itemList.add(new Item(R.drawable.nepal, "népal"));
        this.itemList.add(new Item(R.drawable.norvege, "norvege"));
        this.itemList.add(new Item(R.drawable.perou, "perou"));
        this.itemList.add(new Item(R.drawable.philippines, "philippines"));
        this.itemList.add(new Item(R.drawable.turquie, "turquie"));
        this.itemList.add(new Item(R.drawable.urss, "urss"));
    }
}
