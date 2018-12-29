package com.example.day15title;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);这个一定要注释掉

        TabHost tabHost = getTabHost();//获取TabHost
        //获取视图
        LayoutInflater.from(this).inflate(R.layout.activity_main, tabHost.getTabContentView(), true);
        //通过布局的tab1 newTabSpec                     设置标题              设置图片
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("刘昊然").setContent(R.id.tab01));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("我喜欢刘昊然").setContent(R.id.tab02));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("晓娜喜欢易烊千玺").setContent(R.id.tab03));

//        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
//            @Override
//            public void onTabChanged(String tabId) {
//                Toast.makeText(MainActivity.this, "你最美你最美你最美", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
