package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by champwang on 2018/7/31.
 */

public class AnotherFragment extends Fragment {
    public AnotherFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("AnotherFragment onCreateView");
        View root = inflater.inflate(R.layout.fragment_another, container, false);

        root.findViewById(R.id.btnBackFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return root;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("AnotherFragment onCreate()");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("AnotherFragment onPause()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("AnotherFragment onDestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("AnotherFragment onDestroy()");
    }
}


