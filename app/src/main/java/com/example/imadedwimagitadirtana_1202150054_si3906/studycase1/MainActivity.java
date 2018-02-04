package com.example.imadedwimagitadirtana_1202150054_si3906.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //    Deklarasi variabel yang akan digunakan
    Button Abnormal, Eatbus;
    EditText makanan, porsi;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName(); //untuk mengetahui apakah button telah diclick dengan melihat log

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method untuk memulai aktivitas
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  Mencari berdasarkan id pada masing-masing button dan edittext
        Eatbus = (Button)findViewById(R.id.button_eatbus);
        Abnormal = (Button)findViewById(R.id.button_abnormal);
        makanan = (EditText)findViewById(R.id.namamakanan);
        porsi = (EditText)findViewById(R.id.jumlahporsi);

//  untuk button Abnormal
        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //method untuk click button
                Intent pindah = new Intent(MainActivity.this, Main2Activity.class);
                String tempat = Abnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                Log.d(LOG_TAG, "Button clicked!");
                startActivity(pindah);

            }
        });

        //untuk button Eatbus
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //method untuk click button
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                Log.d(LOG_TAG, "Button clicked!");
                startActivity(pindah);
            }
        });
    }
}
