package com.champwang.test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MyListViewTest extends Activity {

//    private String[] data = { "Apple", "Banana","Orange","Watermelon",
//        "Pear","Grape","Pineapple","Strawberry","Cherry","Mango" };

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylistviewtest);
        initFruits();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                MyListViewTest.this, android.R.layout.simple_list_item_1, data);

        FruitAdapter adapter = new FruitAdapter(MyListViewTest.this, R.layout.fruit_item, fruitList);
        ListView lv = (ListView) findViewById(R.id.myListView);
        lv.setAdapter(adapter);

    }

    private void initFruits() {
        Fruit apple =  new Fruit("Apple", R.drawable.ic_menu_send);
        fruitList.add(apple);
        Fruit orange;
        for(int i = 0; i < 20; i ++)
        {
            orange =  new Fruit("orange", R.drawable.ic_menu_send);
            fruitList.add(orange);
        }

    }
}
