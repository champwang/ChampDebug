package com.champwang.test.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by champwang on 2018/7/26.
 */
class TrackAdapter extends RecyclerView.Adapter {

    public static interface OnItemClickListener {
        void onItemClick(View view);
        void onItemLongClick(View view);
    }
    private OnItemClickListener mItemClickListener;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        //View  v = LayoutInflater.from(parent.getContext()).inflate(R.layout.track_cell,null);
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.track_cell, parent, false);

        TrackAdapterViewHolder tavh = new TrackAdapterViewHolder(v);
        return tavh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        TrackAdapterViewHolder vh = (TrackAdapterViewHolder) holder;

        TrackData td = data[position];
        vh.getTvIndexVH().setText("  " + position + "  ");
        vh.getTvTitleVH().setText(td.tvTitle);
        vh.getTvContentVH().setText("   " + td.tvContent);

        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //item 点击事件
//                Toast.makeText(parent.getContext(), "你想提示的信息",Toast.LENGTH_LONG).show();
                System.out.println("tavh.itemView.setOnClickListener" + "   " + position);

                onRecyclerViewItemSelected(v, position);

            }
        });


        vh.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
//                mItemClickListener.onItemLongClick(v);
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public boolean onRecyclerViewItemSelected(View v, final int position)
    {
        switch (position)
        {
            case 0:
                System.out.println("FragmentMainActivity" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), FragmentMainActivity.class));
                break;
            case 1:
                System.out.println("SliderActivity start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), SliderActivity.class));
                break;

            case 2:
                System.out.println("TabbedActivity start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), TabbedActivity.class));
                break;

            case 3:
                System.out.println("FrameLayoutTest start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), FrameLayoutTest.class));
                break;

            case 4:
                System.out.println("LayoutWeightTest start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), LayoutWeightTest.class));
                break;

            case 5:
                System.out.println("ActivityAddWidgetCode start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), ActivityAddWidgetCode.class));
                break;

            case 6:
                System.out.println("DebugInfo start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), DebugInfo.class));
                break;

            case 7:
                System.out.println("ChooseADate start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), ChooseADate.class));
                break;
            case 8:
                System.out.println("SingleChoose start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), SingleChoose.class));
                break;

            case 9:
                System.out.println("MulChoose start" + "   position: " + position);
                v.getContext().startActivity(new Intent(
                        v.getContext(), MulChoose.class));
                break;

            default:
                System.out.println("tavh.itemView.setOnClickListener" + "   dafault" +
                        position);
        }

        return true;
    }


    private TrackData[] data = new TrackData[]{
            new TrackData("0","Fragment", "一些基本用法"),

            new TrackData("1","SliderActivity", "启动有侧边栏的Activity"),
            new TrackData("2","TabbedActivity", "用一个例子演示"),
            new TrackData("3","FrameLayoutTest", "轻量级"),
            new TrackData("4","LayoutWeightTest", "WeightTest"),
            new TrackData("5","ActivityAddWidgetCode", "Add Widgets"),

            new TrackData("6","StartDebug", "getSystemInfo"),
            new TrackData("7","ChooseADate", "a sample"),
            new TrackData("8","SingleChoose", "sample"),
            new TrackData("9","MulChoose", "sample"),

            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("1","test", "11"),
            new TrackData("2","test", "222"),
            new TrackData("3","test", "3333"),
            new TrackData("4","test", "444444")
    };
}
