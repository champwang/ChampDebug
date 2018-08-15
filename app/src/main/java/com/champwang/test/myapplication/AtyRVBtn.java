package com.champwang.test.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AtyRVBtn extends AppCompatActivity {
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv = new RecyclerView(this);

        setContentView(rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter() {
            class ViewHolder extends RecyclerView.ViewHolder{
                private Button btn;
                public ViewHolder(View itemView) {
                    super(itemView);
                    btn = (Button) itemView;
                }

                public Button getTv() {
                    return btn;
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(new Button(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ViewHolder vh = (ViewHolder) holder;
//                vh.getTv().setText("Item" + position);
                vh.getTv().setText(data[position]);
            }

            @Override
            public int getItemCount() {
                return data.length;
            }

            private String[] data = new String[]{"hello2", "champwang", "good", "luck"};
         });

    }

    public static Intent getStartActivityIntent(MainActivity mainActivity) {
        return new Intent(mainActivity, AtyRVBtn.class);
    }
}
