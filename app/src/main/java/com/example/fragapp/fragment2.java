package com.example.fragapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fragment2 extends ListFragment {

    String[] AndroidApp = new String[]{
            "Master Android App",
            "Master Android Pro App",
            "Master Flutter",
            "Master Kotlin",
            "Subscribe to our channel",
            "Rate our app"
    };

    String[] Descriptions = new String[]{
            "Over 900,000 user with 4.7 rating",
            "Support us by buying this app with 0.99",
            "Learn Flutter from zero by this app(4.8 rating)",
            "Learn Kotlin from zero to hero",
            "Get tutorials & source code AndroidMasterApp Channel",
            "rate Master Android App 5 stars on playstore"
    };

    public fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, AndroidApp);
        setListAdapter(adapter);

        return  view;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        fragment1 txt = (fragment1) getFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(AndroidApp[position],  "Version: "+Descriptions[position]);
        getListView().setSelector(R.color.teal_200);

    }
}