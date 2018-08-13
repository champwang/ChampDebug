package com.champwang.test.myapplication;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static android.app.PendingIntent.getActivity;

public class TrackRecyclerView extends AppCompatActivity {
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv = new RecyclerView(this);
        setContentView(rv);
        //设置布局管理器
//        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv.setLayoutManager(new LinearLayoutManager(this));
//        rv.setLayoutManager(new GridLayoutManager(this, 3));


        //设置adapter
        TrackAdapter adapter = new TrackAdapter();
        rv.setAdapter(adapter);


        //设置Item增加、移除动画
//        rv.setItemAnimator(new DefaultItemAnimator());

        // 设置item动画
        rv.setItemAnimator(new DefaultItemAnimator());

        //添加分割线
//        rv.addItemDecoration(new DividerItemDecoration(
//                getActivity(), DividerItemDecoration.HORIZONTAL_LIST));

        //添加Android自带的分割线
        rv.addItemDecoration(new DividerItemDecoration(
                this,DividerItemDecoration.VERTICAL));

        //添加自定义分割线
        DividerItemDecoration divider = new DividerItemDecoration(
                this,DividerItemDecoration.VERTICAL);
        divider.setDrawable(ContextCompat.getDrawable(this,R.drawable.custom_divider));

        rv.addItemDecoration(divider);

        //添加Android自带的分割线
        rv.addItemDecoration(new DividerItemDecoration(
                this,DividerItemDecoration.VERTICAL));

    }

}
