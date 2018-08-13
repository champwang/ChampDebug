package com.champwang.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AtyRecyclerView extends AppCompatActivity {

    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv = new RecyclerView(this);
        setContentView(rv);
//        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setAdapter(new RecyclerView.Adapter() {
            //自定义一个类
            class ViewHolder extends RecyclerView.ViewHolder{
                private TextView tv;
                //添加一个构造函数
                public ViewHolder(View itemView) {
                    super(itemView);
                    tv = (TextView) itemView;
                }

                public TextView getTv() {
                    return tv;
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ViewHolder vh = (ViewHolder) holder;
                //对TextView 进行赋值
                vh.getTv().setText("ItemRecyclerView_" + position);
            }

            @Override
            public int getItemCount() {
                return 200;
            }
        });
    }
}
