package com.rikenmaharjan.automaticcounter.Views.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rikenmaharjan.automaticcounter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CounterDetailView extends Fragment {


    public CounterDetailView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailview, container, false);
    }

}
