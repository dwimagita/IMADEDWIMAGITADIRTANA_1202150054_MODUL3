package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenuActivity extends AppCompatActivity {
    private Button btnAdd, btnMin;
    private ImageView progress, lblImg;
    private TextView lblJudul, lblDesc, lblStats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
//membuat variable untuk button agar bisa dipanggil
        btnAdd = findViewById(R.id.btnIsiTambah);
        btnMin = findViewById(R.id.btnIsiKurang);
        progress = findViewById(R.id.isibotol);
//membuat variable untuk textview agar bisa dipanggil
        lblJudul = findViewById(R.id.JudulDetail);
        lblDesc = findViewById(R.id.DeskripsiDetail);
        lblImg = findViewById(R.id.logomerk);
        lblStats = findViewById(R.id.Status);
//intent
        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        lblJudul.setText(title);
        lblDesc.setText(description);
        lblImg.setImageResource(imgRes);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            //method untuk saat menekan tombol memambahkan volume air
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            //method untuk saat menekan tombol mengurangi volume air
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }

//method untuk menambah volume air
    public void tambahIsi(){
        status();
        //kondisi jika air penuh
        if(level==6){
            Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
    }
//method untuk mengurangi volume air
    public void kurangIsi(){
        status();
        //kondisi jika air kurang atau sama dengan level 0
        if(level==0){Toast.makeText(this,"Air Sedikit",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }
//untuk menampilkan volume air saat ini
    public void status(){
        lblStats.setText(""+level+"L");
    }
}