package com.example.popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,button);
                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.java:
                                Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
                                break;

                            case R.id.android:
                                Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                                break;

                            case R.id.kotlin:
                                Toast.makeText(getApplicationContext(), "Kotlin", Toast.LENGTH_LONG).show();
                                break;
                        }
                        return false;
                    }
                });

                popupMenu.show();
            }
        });
    }
}
