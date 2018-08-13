package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by champwang on 2018/8/2.
 */

public class IVFragment extends Fragment {

    public IVFragment() {
    }

//    public IVFragment (int position) {
//        this.position = position;
//    }
    private static final String ARG_SECTION_NUMBER = "section_number";

    public static IVFragment newInstance(int sectionNumber) {
        IVFragment fragment = new IVFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(
            LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        int sectionNumber = 0;
        ImageView iv = new ImageView(getActivity());
//
//        View rootView = inflater.inflate(R.layout.fragment_tabbed,
//                container, false);

        sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);

        switch (sectionNumber){
            case 0:
                iv.setImageResource(R.drawable.image1);
                break;
            case 1:
                iv.setImageResource(R.drawable.image2);
                break;
            case 2:
                iv.setImageResource(R.drawable.image3);
                break;
            default:
                iv.setImageResource(R.drawable.image4);
                break;
        }
        return iv;

    }
}
