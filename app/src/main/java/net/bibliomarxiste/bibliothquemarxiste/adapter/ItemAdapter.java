package net.bibliomarxiste.bibliothquemarxiste.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.ArrayList;
import net.bibliomarxiste.bibliothquemarxiste.utils.Item;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Item> itemList;
    private int width;
    private int height;

    public ItemAdapter(Context context, ArrayList<Item> itemList, int width, int height) {
        this.context = context;
        this.itemList = itemList;
        this.width = width;
        this.height = height;
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
            imgView.setLayoutParams(new GridView.LayoutParams(this.width, this.height));
            imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        imgView.setImageResource(this.itemList.get(position).getRes());
        return imgView;
    }
}
