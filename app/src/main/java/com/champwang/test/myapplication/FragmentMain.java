package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by champwang on 2018/8/1.
 */

public class FragmentMain extends Fragment {
    public FragmentMain() {
    }

    @Nullable
    @Override
    public View onCreateView(
            LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        System.out.println("FragmentMain onCreateView");
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        root.findViewById(R.id.btnFragmentMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.containerFragment,new AnotherFragment())
                        .commit();
            }
        });
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("FragmentMain onCreate()");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("FragmentMain onPause()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("FragmentMain onDestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("FragmentMain onDestroy()");
    }
}
