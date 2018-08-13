package com.example.blake.tessera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Topup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup);

        android.support.v7.widget.Toolbar hamburger = (android.support.v7.widget.Toolbar) findViewById(R.id.hamburger);
        hamburger.setBackground(getResources().getDrawable(R.color.colorAccent));

        setSupportActionBar(hamburger);

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home");
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Topup");
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName("Settings");


        final Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(hamburger)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        new DividerDrawerItem(),
                        item3
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                                                   @Override


                                                   public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {


                                                       if(drawerItem.getIdentifier() == 1)
                                                       {
                                                           Intent intent = new Intent(Topup.this, MainActivity.class);
                                                           startActivity(intent);
                                                           finish();

                                                       }
                                                       else if(drawerItem.getIdentifier() == 2)
                                                       {
                                                          //do nothing
                                                       }
                                                       else if(drawerItem.getIdentifier() == 3)
                                                       {
                                                           Intent intent = new Intent(Topup.this, settings.class);
                                                           startActivity(intent);
                                                           finish();
                                                       }

                                                       return true;
                                                   }

                                               }


                ).build();
    }
}
