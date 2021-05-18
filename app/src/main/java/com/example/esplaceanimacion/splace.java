package com.example.esplaceanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splace extends AppCompatActivity {
private static  final long SPLASH_SCREEN_DELAY= 3000;

    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logo,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animacion);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.boton_animacion);

        image=findViewById(R.id.imageView2);
        logo=findViewById(R.id.textView);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent intent=new Intent(splace.this,login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}