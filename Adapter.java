package com.example.a41639786.intentadapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    ArrayList<ItemList> items;

    public Adapter(Context c, ArrayList<ItemList> is){
        this.context= c;
        this.items=is;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup ) {
        view = LayoutInflater.from(context).inflate(R.layout.itemlista, null);
        ImageView imagen= view.findViewById(R.id.itemimage);
        TextView producto=view.findViewById(R.id.producto);
        TextView cantidad=view.findViewById(R.id.cantidad);
        ItemList item=(ItemList) getItem(i);
        imagen.setImageResource(item.getImagen());
        producto.setText(item.getProducto());
        cantidad.setText(item.getCantidad());


        return view;
    }
}
