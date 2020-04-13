package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

TextView tv;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= findViewById(R.id.txt);
        registerForContextMenu(tv);
        b=findViewById(R.id.button);
        //pop up menu code is here
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu pop =new PopupMenu(MainActivity.this,b);
                pop.getMenuInflater().inflate(R.menu.popupmenu, pop.getMenu());
                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this, "this is the option you clicked: "
                                +item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                pop.show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.classicmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this,"Item 1 selected in classic menu",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i2:
                Toast.makeText(this,"Item 2 selected in classic menu",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i3:
                Toast.makeText(this,"Item 3 selected in classic menu",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i4:
                Toast.makeText(this,"Item 4 selected in classic menu",Toast.LENGTH_SHORT).show();
                return true;


        }
        return super.onOptionsItemSelected(item);
    }

//context menu stuffs here
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch(v.getId()){
            case R.id.txt:
                createMenu(R.menu.contextmenu,menu,"choose");
                break;
            default:
                     super.onCreateContextMenu(menu, v, menuInfo);
    }
    }
private void createMenu(int  menuID,ContextMenu menu,  String Title){
        MainActivity.this.getMenuInflater().inflate(menuID,menu);
        menu.setHeaderTitle(Title);
}
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {case R.id.it1:
            tv.setBackgroundResource(R.color.blue);
            return true;
            case R.id.it2:
                tv.setBackgroundResource(R.color.cyan);
                return true;
            case R.id.it3:
                tv.setBackgroundResource(R.color.purple);
                return true;
                case R.id.it4:
            tv.setBackgroundResource(R.color.magenda);
            return true;
            default:
            return super.onContextItemSelected(item);
    }
}
}
