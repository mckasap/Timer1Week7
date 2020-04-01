package org.kasapbasi.timer1week7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
            /**
             * Callback fired on regular interval.
             *
             * @param millisUntilFinished The amount of time until finished.
             */
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("Tick","Countdown in progres "+(millisUntilFinished)/1000+"left");
            }

            /**
             * Callback fired when the time is up.
             */
            @Override
            public void onFinish() { Log.d("Fin","Countdown finished");}
        };
        countDownTimer.start();
        /*final Handler myHandler= new Handler();
        Runnable myrun = new Runnable() {
            @Override
            public void run() {
                Log.d("sonuc","Bir saniye geçti");
                myHandler.postDelayed(this,1000); //belirtilen ms bekler çalıştırır.
                    //Burada kendi kendini çalıştırıyor.
            }
        };
        myHandler.post(myrun); // anında çalıştırır*/

    }
}
