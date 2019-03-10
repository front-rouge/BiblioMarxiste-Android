package net.bibliomarxiste.bibliothquemarxiste.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.bibliomarxiste.bibliothquemarxiste.R;
import net.bibliomarxiste.bibliothquemarxiste.utils.Entry;

import java.util.ArrayList;

public class EntryAdapter extends BaseAdapter {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ENTRY = 1;
    private ArrayList<Object> entries;
    private LayoutInflater inflater;

    public EntryAdapter(Context context, ArrayList<Object> entries) {
        this.entries = entries;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemViewType(int position) {
        if (entries.get(position) instanceof String) {
            return TYPE_HEADER;
        }
        return TYPE_ENTRY;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return this.entries.size();
    }

    @Override
    public Object getItem(int position) {
        return this.entries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            if (this.getItemViewType(position) == TYPE_HEADER) {
                convertView = inflater.inflate(R.layout.list_text_header, null);
            } else {
                convertView = inflater.inflate(R.layout.list_text_entry, null);
            }
        }

        if (this.getItemViewType(position) == TYPE_HEADER) {
            TextView textView = convertView.findViewById(R.id.list_text_header);
            textView.setText((String) this.entries.get(position));
        } else {
            Entry entry = (Entry) this.entries.get(position);
            TextView textYear = convertView.findViewById(R.id.list_text_entry_year);
            textYear.setText(entry.getYear() != null ? entry.getYear().toString() : "");
            TextView textTitle = convertView.findViewById(R.id.list_text_entry_title);
            textTitle.setText(entry.getTitle());
        }
        return convertView;
    }
}
