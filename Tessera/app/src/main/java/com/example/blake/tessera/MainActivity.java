package com.example.blake.tessera;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Vibrator;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Button signInToAut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       android.support.v7.widget.Toolbar hamburger = (android.support.v7.widget.Toolbar) findViewById(R.id.hamburger);
//       hamburger.setBackground(getResources().getDrawable(R.color.colorAccent));

       setSupportActionBar(hamburger);


        signInToAut = (Button) findViewById(R.id.signInToAut);

        signInToAut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, NorthCampus.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
