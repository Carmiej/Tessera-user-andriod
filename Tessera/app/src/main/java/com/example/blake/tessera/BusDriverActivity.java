package com.example.blake.tessera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BusDriverActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    BusDiverAdapter adapter;

    List<BusDriverList> driverList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_driver);

        driverList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewDrivers);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        driverList.add(
                new BusDriverList(
                        1,
                        1111,
                        1234,
                        10
 //                      R.drawable.blakeMclean
                         ));

        driverList.add(
                new BusDriverList(
                        1,
                        2222,
                        9999,
                        4
 //                      R.drawable.dominicPorter
                         ));

        driverList.add(
                new BusDriverList(
                        1,
                        3333,
                        9876,
                        9
//                       R.drawable.izaacCrooke
                         ));

        adapter = new BusDiverAdapter(this, driverList);
        recyclerView.setAdapter(adapter);
    }
}
