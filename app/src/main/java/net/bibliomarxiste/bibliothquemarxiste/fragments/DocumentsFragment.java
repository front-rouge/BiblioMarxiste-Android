package net.bibliomarxiste.bibliothquemarxiste.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;
import net.bibliomarxiste.bibliothquemarxiste.ListTextActivity;
import net.bibliomarxiste.bibliothquemarxiste.R;
import net.bibliomarxiste.bibliothquemarxiste.adapter.ItemAdapter;
import net.bibliomarxiste.bibliothquemarxiste.utils.Item;

public class DocumentsFragment extends Fragment {
    private ArrayList<Item> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.documents_fragment, null);

        GridView gridView = (GridView) view;
        this.itemList = new ArrayList<>();
        this.populateGrid();

        gridView.setAdapter(new ItemAdapter(this.getContext(), this.itemList, 500, 350));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), ListTextActivity.class);
                intent.putExtra("data", itemList.get(position).getName());
                view.getContext().startActivity(intent);
            }
        });

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
