package com.example.assignment3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class question3Adapter extends BaseAdapter {

    private Context mContext;
    private List<question3> mq3list;

    public question3Adapter(Context mContext, List<question3> mq3list) {
        this.mContext = mContext;
        this.mq3list = mq3list;
    }

    @Override
    public int getCount() {
        return mq3list.size();
    }

    @Override
    public Object getItem(int position) {
        return mq3list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= View.inflate(mContext,R.layout.q3_list,null);
        TextView tname=v.findViewById(R.id.title);
        TextView tdesc=v.findViewById(R.id.desc);
        tname.setText(mq3list.get(position).getName());
        tdesc.setText(mq3list.get(position).getDesc());
        v.setTag(mq3list.get(position).getId());
        return v;
    }
}
