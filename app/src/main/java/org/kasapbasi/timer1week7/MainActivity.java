package org.kasapbasi.timer1week7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler myHandler= new Handler();
        Runnable myrun = new Runnable() {
            @Override
            public void run() {

                Log.d("sonuc","Bir saniye geçti");
                myHandler.postDelayed(this,1000); //belirtilen ms bekler çalıştırır.
                    //Burada kendi kendini çalıştırıyor.
            }
        };
        myHandler.post(myrun); // anında çalıştırır
    }
}
