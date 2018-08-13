package com.champwang.test.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by champwang on 2018/7/25.
 */
class TrackAdapterViewHolder extends RecyclerView.ViewHolder {
    private View root;
    private TextView tvIndexVH;
    private TextView tvTitleVH;
    private TextView tvContentVH;

    public TrackAdapterViewHolder(View root) {
        super(root);
        tvIndexVH = (TextView)root.findViewById(R.id.tvIndex);
        tvTitleVH = (TextView) root.findViewById(R.id.tvTitle);
        tvContentVH = (TextView) root.findViewById(R.id.tvContent);
    }

    public TextView getTvIndexVH() {
        return tvIndexVH;
    }

    public TextView getTvTitleVH() {
        return tvTitleVH;
    }
    public TextView getTvContentVH() {
        return tvContentVH;
    }
}
