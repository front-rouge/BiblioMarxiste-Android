package net.bibliomarxiste.bibliothquemarxiste.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import net.bibliomarxiste.bibliothquemarxiste.utils.Item;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Item> itemList;
    private int w;
    private int h;

    public ItemAdapter(Context context, ArrayList<Item> itemList, int w, int h) {
        this.context = context;
        this.itemList = itemList;
        this.w = w;
        this.h = h;
    }

    @Override
    public int getCount() {
        return this.itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ImageView imgView;

        imgView = (ImageView) convertView;
        if (convertView == null) {
            imgView = new ImageView(this.context);
            imgView.setLayoutParams(new GridView.LayoutParams(this.w, this.h));
            imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        imgView.setImageResource(this.itemList.get(position).getRes());
        return imgView;
    }
}
