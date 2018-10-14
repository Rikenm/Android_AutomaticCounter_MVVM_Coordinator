package com.rikenmaharjan.automaticcounter.Coordinator.Navigator;


import android.support.v4.app.FragmentActivity;

import com.rikenmaharjan.automaticcounter.R;
import com.rikenmaharjan.automaticcounter.Views.Fragment.CounterDetailView;
import com.rikenmaharjan.automaticcounter.Views.Fragment.Rootview;

public class Navigator {


    private FragmentActivity activity;

    public void showNewsList(){

        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new Rootview())
                .commit();

    }

    public void  showNewsDetails(int counterId) {

        activity.getSupportFragmentManager()
                .beginTransaction()
//                .replace(R.id.fragmentContainer, NewsDetailFragment.newInstance(newsId))
                .replace(R.id.fragmentContainer, new CounterDetailView())
                .addToBackStack("NewsDetail")
                .commit();
    }



}
