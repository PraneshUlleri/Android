package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fragmentone extends Fragment {

    String[] country = new String[]{"IN","BH","UAE","USA"};
    ListView lv;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fragmentone, container, false);
        lv=view.findViewById(R.id.lv);
        ArrayAdapter<String>adap=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,country);
        lv.setAdapter(adap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragmenttwo fragment= (Fragmenttwo) getFragmentManager().findFragmentById(R.id.fragment2);
                fragment.change(" you choose :"+country[position]);
                lv.setSelector(android.R.color.holo_blue_dark);
            }
        });
        return view;
}}