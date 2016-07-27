package com.taojt.arrayadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1 = (ListView) findViewById(R.id.list1);
        String[] array1 = {"孙悟空", "猪八戒", "沙僧", "唐三藏", "牛魔王", "二郎神", "哪吒",};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, R.layout.array_item, array1);
        list1.setAdapter(adapter1);

        ListView list2 = (ListView) findViewById(R.id.list2);
        String[] array2 = {"Apple", "Watermelon", "Pipe", "Banana", "Orange", "Tomato", "Potato"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, R.layout.check_item, array2);
        list2.setAdapter(adapter2);
    }
}
