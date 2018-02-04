package com.example.imadedwimagitadirtana_1202150054_si3906.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Main2Activity extends AppCompatActivity {

    private static final String LOG_TAG =
            Main2Activity.class.getSimpleName();
    //    Deklarasi variabel
    int uangOsas = 65500;
    int harganasi, total, totalHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        TextView Makanan = (TextView) findViewById(R.id.namamakanan);
        TextView Porsi = (TextView) findViewById(R.id.jumlahporsi);
        TextView tempat = (TextView) findViewById(R.id.namatempat);
        TextView harga = (TextView) findViewById(R.id.hargamakanan);
//        untuk mendapatkan intent dari layout 1
        Intent intent = getIntent();

//      Menerima dari activity sebelumnya
        String makanan = intent.getStringExtra("makanan");
        String Tempat = intent.getStringExtra("tempat");
        String porsi = intent.getStringExtra("porsi");
//      menDisplay
        Makanan.setText(makanan);
        Porsi.setText(porsi);
        tempat.setText(Tempat);

        switch (Tempat) { //saat mengclick button tempat yang pilih maka harga akan berubah
            case "EATBUS":
                harganasi = 50000;
                break;
            case "ABNORMAL":
                harganasi = 30000;
                break;
        }
        total = parseInt(porsi) * harganasi; //total harga dari menu, porsi dan tempat yang dipilih
        String totalHarga = Integer.toString(total);
        //untuk memunculkan toast sesuai kondisi
        if (uangOsas < total) {
            harga.setText("Rp" + totalHarga);
            Toast.makeText(this, "Jangan makan malam disini, berat. Uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        } else {
            harga.setText("Rp" + totalHarga);
            Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();
        }
    }

    //untuk mengetahui status / log dari aplikasi yang dijalankan
    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart"); //memulai aplikasi
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart"); //mengulang membuka aplikasi
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume"); //melanjutkan aplikasi
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause"); //aplikasi jeda
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop"); //aplikasi berhenti
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy"); //aplikasi dihancurkan
    }
}
