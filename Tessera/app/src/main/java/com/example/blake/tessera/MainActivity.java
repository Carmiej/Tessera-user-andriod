package com.example.blake.tessera;

<<<<<<< HEAD
import android.content.Intent;
=======
import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Vibrator;
import android.support.v4.app.ActivityCompat;
>>>>>>> parent of c64ae8c... Cover Page
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button signInToAut;
=======
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
    SurfaceView surfaceView;
    CameraSource cameraSource;
    TextView textView;
    BarcodeDetector barcodeDetector;

>>>>>>> parent of 17d74f9... Re-start 2018

=======
>>>>>>> parent of c64ae8c... Cover Page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

       android.support.v7.widget.Toolbar hamburger = (android.support.v7.widget.Toolbar) findViewById(R.id.hamburger);
//       hamburger.setBackground(getResources().getDrawable(R.color.colorAccent));

       setSupportActionBar(hamburger);

<<<<<<< HEAD
<<<<<<< HEAD

        signInToAut = (Button) findViewById(R.id.signInToAut);

        signInToAut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, BusDriverActivity.class);
                startActivity(intent);
                finish();
            }
        });
=======
       surfaceView = (SurfaceView) findViewById(R.id.cameraPreview);
       barcodeDetector = new BarcodeDetector.Builder(this).setBarcodeFormats(Barcode.QR_CODE).build();
       textView = (TextView) findViewById(R.id.textView);
       cameraSource = new CameraSource.Builder(this, barcodeDetector).setRequestedPreviewSize(640,480).build();

       surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
           @Override
           public void surfaceCreated(SurfaceHolder holder) {
               if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
                   return;
               }
               try{
                   cameraSource.start(holder);
               }catch(IOException e){

               }
           }

           @Override
           public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

           }

           @Override
           public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                cameraSource.stop();
           }
       });

        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {

            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {
                final SparseArray<Barcode> qrCode = detections.getDetectedItems();

                if(qrCode.size() != 0){
                    textView.post(new Runnable() {
                        @Override
                        public void run() {
                            Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(1000);

                            textView.setText(qrCode.valueAt(0).displayValue);
                        }
                    });
                }
            }
        });


>>>>>>> parent of 17d74f9... Re-start 2018
=======
>>>>>>> parent of c64ae8c... Cover Page
    }
}
