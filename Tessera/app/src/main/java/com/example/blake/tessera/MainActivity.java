package com.example.blake.tessera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       android.support.v7.widget.Toolbar hamburger = (android.support.v7.widget.Toolbar) findViewById(R.id.hamburger);
       hamburger.setBackground(getResources().getDrawable(R.color.colorAccent));

       setSupportActionBar(hamburger);



        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home");
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Settings");


        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(hamburger)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem item1) {
                        Intent intent = new Intent(MainActivity.this, Topup.class);
                        startActivity(intent);
                        finish();
                        return true;
                    }
                }).build();
    }
}
