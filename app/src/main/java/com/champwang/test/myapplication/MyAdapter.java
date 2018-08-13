package com.champwang.test.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by champwang on 2018/6/22.
 */
class MyAdapter extends RecyclerView.Adapter {
    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;
        private TextView tvTitle;
        private TextView tvContent;

        public ViewHolder(View root) {
            super(root);
            tvTitle = root.findViewById(R.id.tvTitle);
            tvContent = root.findViewById(R.id.tvContent);
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvContent() {
            return tvContent;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_cell, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
//                vh.getTv().setText("Item" + position);
//        vh.getTv().setText(data[position]);
        CellData cd = data[position];
        vh.getTvTitle().setText(cd.title);
        vh.getTvContent().setText(cd.content);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    private CellData[] data = new CellData[]{
            new CellData("title1", "content1"),
            new CellData("title1", "content1"),
            new CellData("title2", "content2")};
//    private String[] data = new String[]{"hello2", "champwang", "good", "luck"};
}
