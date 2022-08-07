package myapplication.picodiploma.dicoding.com.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private ImageView iv;
    private TextView tv;
    private static int SPLASH_TIME_OUT=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iv =(ImageView) findViewById(R.id.iv);
        tv = (TextView) findViewById(R.id.tv);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.textanim);
        tv.startAnimation(anim);

        Animation mmyanim = AnimationUtils.loadAnimation(this, R.anim.transition);
        iv.startAnimation(mmyanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(Splash.this, MainActivity.class);
                startActivity(a);

                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);

    };
}
