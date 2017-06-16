package com.example.makena.anew;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by makena on 08/06/17.
 */

public class ListViewActivity extends ListActivity {

    private ArrayList<String> data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_view_activity);

         String fruits[] = new String[] { "Apple", "Avocado", "Banana",
                "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
                "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.fruits_tv, fruits);

        setListAdapter(adapter);


        




    }
}
