package com.example.makena.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button okay = (Button) findViewById(R.id.btn_okay);
        Button btn_one = (Button) findViewById(R.id.btn_one);

        Button btn_custom_list_view = (Button) findViewById(R.id.btn_list_custom);

        Button btn_two = (Button) findViewById(R.id.btn_two);

        Button btn_register = (Button) findViewById(R.id.btn_register);

        Button btn_list_view = (Button) findViewById(R.id.btn_list);


        btn_list_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(list);
            }
        });

        btn_custom_list_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                Intent custom_list = new Intent(MainActivity.this, ListViewCustom.class);
                startActivity(custom_list);
            }
        });


        okay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(MainActivity.this, "You have clicked button okay", Toast.LENGTH_SHORT);
                t.show();
            }
        });


        btn_one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is BUTTON ONE", Toast.LENGTH_SHORT).show();
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is BUTTON TWO", Toast.LENGTH_SHORT).show();
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(MainActivity.this, RegisterActivity.class);
                Toast.makeText(MainActivity.this, "Go to register class", Toast.LENGTH_SHORT).show();
                startActivity(reg);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
