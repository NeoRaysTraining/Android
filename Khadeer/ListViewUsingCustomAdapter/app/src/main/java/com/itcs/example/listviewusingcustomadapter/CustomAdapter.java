package com.itcs.example.listviewusingcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khussain on 5/2/2016.
 */
public class CustomAdapter extends ArrayAdapter{
    List list=new ArrayList();
    public CustomAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler
    {
        TextView Fname;
        TextView Lname;
        TextView Native;
        ImageView imageView;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View row;
        row=convertView;
        DataHandler handler;
        if(convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.custom_layout,parent,false);
            handler= new DataHandler();
            handler.Fname= (TextView) row.findViewById(R.id.TextView01);
            handler.Lname= (TextView) row.findViewById(R.id.TextView02);
            handler.Native=(TextView)row.findViewById(R.id.TextView03);
            handler.imageView= (ImageView) row.findViewById(R.id.imageView1);
            row.setTag(handler);
        }
        else
        {
            handler= (DataHandler) row.getTag();
        }
        CustomAdapterDataProvider dataProvider;
        dataProvider= (CustomAdapterDataProvider) this.getItem(position);
        handler.Fname.setText(dataProvider.getFname());
        handler.Lname.setText(dataProvider.getLname());
        handler.Native.setText(dataProvider.getNative());
        handler.imageView.setImageResource(dataProvider.getImage_resources());
        return row;
    }
}
