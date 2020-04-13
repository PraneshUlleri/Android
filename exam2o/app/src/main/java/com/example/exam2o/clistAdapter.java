package com.example.exam2o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class clistAdapter extends BaseAdapter {

    private Context mContext;
    private List<clist> contactlist;


    public clistAdapter(Context mContext, List<clist> contactlist) {
        this.mContext = mContext;
        this.contactlist = contactlist;
    }
    @Override
    public int getCount() {
        return contactlist.size();
    }

    @Override
    public Object getItem(int position) {
        return contactlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= View.inflate(mContext,R.layout.clist,null);
        TextView tname=v.findViewById(R.id.txtname);
        TextView tnum=v.findViewById(R.id.txtnum);
        tname.setText(contactlist.get(position).getName());
        tnum.setText(contactlist.get(position).getNumber());
        v.setTag(contactlist.get(position).getId());

        return v;
    }
}
