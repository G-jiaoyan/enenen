package com.example.day15title;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class kx extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        LayoutInflater.from(this).inflate(R.layout.kx,tabHost.getTabContentView(),true);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("页面一").setContent(R.id.tab01));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("页面二").setContent(R.id.tab02));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("页面三").setContent(R.id.tab03));

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

            }
        });

    }
}
