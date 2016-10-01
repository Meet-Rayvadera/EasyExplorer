package com.rarity.apps.easyexplorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.MenuPopupWindow;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    PopupMenu pup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b = (Button) findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pup = new PopupMenu(MainActivity.this,v);
                pup.setOnMenuItemClickListener(MainActivity.this);
                pup.inflate(R.menu.menu);
                pup.show();
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int order = item.getOrder();
//
//        if(order == 0)
//        {
//            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        else if(order == 1)
//        {
//            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        else
//        return super.onOptionsItemSelected(item);
//
//    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
                int order = item.getOrder();

        if(order == 0)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(order == 1)
        {
            Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        return super.onOptionsItemSelected(item);
    }
}
