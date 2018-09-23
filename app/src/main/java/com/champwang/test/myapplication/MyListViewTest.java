package com.champwang.test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListViewTest extends Activity {

    private String[] data = { "Apple", "Banana","Orange","Watermelon",
        "Pear","Grape","Pineapple","Strawberry","Cherry","Mango" };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylistviewtest);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MyListViewTest.this, android.R.layout.simple_list_item_1, data);

        ListView lv = (ListView) findViewById(R.id.myListView);
        lv.setAdapter(adapter);

    }
}
