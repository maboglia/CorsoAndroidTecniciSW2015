package it.bogliaccino.bogliaccinomyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauro on 26/02/15.
 */
public class MyAdapter extends BaseAdapter{

    protected List<String> item = new ArrayList<String>();

    protected Context context;

    String[] titles;

    public MyAdapter(Context context){
        this.context = context;
    }

    public MyAdapter(Context context, String[] titles) {
        this.context = context;
        this.titles = titles;
    }


    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public void addTitle(String newTitle){
        item.add(newTitle);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            // se la vista è null, la devo creare

            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.about_row, null);

        }


        ((TextView) convertView.findViewById(R.id.titolo_row)).setText(item.get(position));

        return convertView;
    }
}
