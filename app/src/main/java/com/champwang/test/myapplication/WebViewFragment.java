package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by champwang on 2018/8/1.
 */

public class WebViewFragment    extends Fragment {
    public WebViewFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root  =  inflater.inflate(R.layout.webview_fragment,container,false);
        WebView wb = root.findViewById(R.id.wvFragment);
        wb.loadUrl("https://github.com/champwang");
        return root;
    }
}
