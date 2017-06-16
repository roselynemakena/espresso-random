package com.example.makena.anew;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by makena on 16/06/17.
 */

public class ListViewCustom extends Activity {
    String fruits[] = new String[] { "Apple", "Avocado", "Banana",
            "Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
            "Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple" };

    Integer images[] = {R.drawable.apple,R.drawable.blueberries,R.drawable.cabbage,R.drawable.garl,
            R.drawable.grain,R.drawable.grapes,R.drawable.lemon,R.drawable.orange,
            R.drawable.pineapple,R.drawable.pumpkin,R.drawable.strawberry,R.drawable.watermelon,
            R.drawable.apple,

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.custom_activity);

        CustomListAdapter adapter = new CustomListAdapter(this, fruits, images);
        ListView lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
