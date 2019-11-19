package com.example.qianrushi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = new ViewPager();

        LayoutInflater lf = getLayoutInflater().from(this);
        View view1 = lf.inflate(R.layout.pageleft, null);
        View view2 = lf.inflate(R.layout.pageshow, null);
        View view3 = lf.inflate(R.layout.pageright, null);
        ArrayList viewList = new ArrayList<View>();
        // 将要分页显示的View装入数组中
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        viewPager.setAdapter(new MyViewPagerAdapter(views));
        viewPager.setCurrentItem(0);
        //设置页面切换时候的监听器(可选，用了之后要重写它的回调方法处理页面切换时候的事务)
        viewPager.setOnPageChangeListener(new MyOnPageChangeListener());
        FragmentPagerAdapter:
//设置页面切换时的监听器(可选，用了之后要重写它的回调方法处理页面切换时候的事务)
        vp.addOnPageChangeListener(this); vp.setAdapter(new MyFragmentAdapter(getSupportFragmentManager(), list)
    }
}
