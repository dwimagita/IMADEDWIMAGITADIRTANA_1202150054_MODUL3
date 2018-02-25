package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        tvSplash = (TextView) findViewById(R.id.tvSplash);

        //membuat agar ada loading saat membuka aplikasi
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            //method untuk menjalankan activity
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();

            }
        }, 3000L); //3000 L = 3 detik

    }
}
