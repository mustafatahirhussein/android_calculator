package net.mustafa.mid_prac_cal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_act);

        Thread th = new Thread() {

            public void run() {
                try {

                    sleep(2000);

                    Intent it = new Intent(splash_act.this,MainActivity.class);
                    startActivity(it);
                    finish();

                } catch (Exception e) {

                    e.printStackTrace();

                }
            }
        };

        th.start();
    }
}
