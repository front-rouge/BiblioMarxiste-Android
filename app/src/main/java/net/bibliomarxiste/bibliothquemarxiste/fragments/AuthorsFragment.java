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
import net.bibliomarxiste.bibliothquemarxiste.adapter.ItemAdapter;
import net.bibliomarxiste.bibliothquemarxiste.utils.Item;

import java.util.ArrayList;

public class AuthorsFragment extends Fragment {
    private ArrayList<Item> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.authors_fragment, null);

        GridView gridView = (GridView) view;
        this.itemList = new ArrayList<>();
        this.populateGrid();

        gridView.setAdapter(new ItemAdapter(this.getContext(), this.itemList, 300, 400));

        return view;
    }

    private void populateGrid() {
        this.itemList.add(new Item(R.drawable.marx, "marx"));
        this.itemList.add(new Item(R.drawable.engels, "engels"));
        this.itemList.add(new Item(R.drawable.lenin, "lenin"));
        this.itemList.add(new Item(R.drawable.stalin, "stalin"));
        this.itemList.add(new Item(R.drawable.mao, "mao"));
        this.itemList.add(new Item(R.drawable.connolly, "connolly"));
        this.itemList.add(new Item(R.drawable.dimitrov, "dimitrov"));
        this.itemList.add(new Item(R.drawable.gonzalo, "gonzalo"));
        this.itemList.add(new Item(R.drawable.gramsci, "gramsci"));
        this.itemList.add(new Item(R.drawable.guevara, "guevara"));
        this.itemList.add(new Item(R.drawable.hochiminh, "ho chi moinh"));
        this.itemList.add(new Item(R.drawable.kaypakkaya, "kaypakkaya"));
        this.itemList.add(new Item(R.drawable.kollontai, "kollontai"));
        this.itemList.add(new Item(R.drawable.luxembourg, "luxembourg"));
        this.itemList.add(new Item(R.drawable.mariategui, "mariategui"));
        this.itemList.add(new Item(R.drawable.marighella, "marighella"));
        this.itemList.add(new Item(R.drawable.mazumdar, "mazumdar"));
        this.itemList.add(new Item(R.drawable.plekhanov, "plekhanov"));
        this.itemList.add(new Item(R.drawable.politzer, "politzer"));
        this.itemList.add(new Item(R.drawable.sison, "sison"));
        this.itemList.add(new Item(R.drawable.zetkin, "zetkin"));

    }
}
