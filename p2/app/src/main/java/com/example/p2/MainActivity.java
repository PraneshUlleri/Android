    package com.example.p2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater=getMenuInflater();
            menuInflater.inflate(R.menu.mainmenu,menu);

        return true;
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.id1:
                Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.id2:
                Toast.makeText(this,"itm2",Toast.LENGTH_SHORT).show();
                return true;
        }
            return super.onOptionsItemSelected(item);
        }
    }
