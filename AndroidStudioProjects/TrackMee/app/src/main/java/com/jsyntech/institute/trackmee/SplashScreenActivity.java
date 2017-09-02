package com.jsyntech.institute.trackmee;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.io.File;

public class SplashScreenActivity extends Activity {
    private Thread mSplashThread;


    ImageView imageAnim1, imageAnim2, imageAnim3;
    ImageView imAnim1, imAnim2;
    ImageView imSplashDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        SharedPreferences settings=getSharedPreferences("prefs",0);
        boolean firstRun=settings.getBoolean("firstRun",false);

        if(firstRun==false)
        //if running for first time
        //Splash will load for first time
        {

            SharedPreferences.Editor editor=settings.edit();
            editor.putBoolean("firstRun",true);
            editor.commit();

            imSplashDot = (ImageView) findViewById(R.id.dot);
            imSplashDot.setVisibility(View.VISIBLE);

            AnimationDrawable animation = new AnimationDrawable();

            animation.addFrame(getResources().getDrawable(R.drawable.splashs1), 2000);
            animation.addFrame(getResources().getDrawable(R.drawable.splashs2), 6000);

            animation.setOneShot(true);
            ImageView imageAnim = (ImageView) findViewById(R.id.spalshwin);

            imageAnim.setBackgroundDrawable(animation);
            animation.start();


            imageAnim1 = (ImageView) findViewById(R.id.spalshwin1);
            imageAnim2 = (ImageView) findViewById(R.id.spalshwin2);
            imageAnim3 = (ImageView) findViewById(R.id.spalshwin3);

            imAnim1 = (ImageView) findViewById(R.id.sp1);
            imAnim2 = (ImageView) findViewById(R.id.sp2);
            imSplashDot = (ImageView) findViewById(R.id.dot);


/*  ------ For 1St Screen -------   */
            Handler handler11 = new Handler();
            handler11.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashschool), 2000);
                    animation1.setOneShot(true);

                    imSplashDot.setImageResource(R.drawable.bluebutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(1000.0f, 0.0f, 0.0f, 0.0f);
                    animation3.setDuration(500);
                    imageAnim1.startAnimation(animation3);
                    imageAnim1.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 2000);


            Handler handler1 = new Handler();
            handler1.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashschool), 2000);
                    animation1.setOneShot(true);


                    imSplashDot.setImageResource(R.drawable.yellowbutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                    animation3.setDuration(1000);
                    imageAnim1.startAnimation(animation3);
                    imageAnim1.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 2500);


            Handler handler12 = new Handler();
            handler12.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashschool), 2000);
                    animation1.setOneShot(true);

                    imSplashDot.setImageResource(R.drawable.yellowbutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(0.0f, -1000.0f, 0.0f, 0.0f);
                    animation3.setDuration(500);
                    imageAnim1.startAnimation(animation3);
                    imageAnim1.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 3500);

/*  ------ end 1St Screen -------   */


/*  ------ Start 2ndSt Splash Screen -------   */

            Handler handler21 = new Handler();
            handler21.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashcorporate), 2000);
                    animation1.setOneShot(true);
                    imSplashDot.setImageResource(R.drawable.yellowbutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(1000.0f, 0.0f, 0.0f, 0.0f);
                    animation3.setDuration(500);
                    //animation3.setRepeatCount(3);
                    imageAnim1.setVisibility(View.GONE);
                    imageAnim2.startAnimation(animation3);
                    imageAnim2.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 4000);


            Handler handler2 = new Handler();
            handler2.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    //animation1.addFrame(getResources().getDrawable(R.drawable.splashschool), 2000);
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashcorporate), 2000);
                    //animation1.addFrame(getResources().getDrawable(R.drawable.splashpersonal), 2000);
                    animation1.setOneShot(true);
                    //ImageView imageAnim1 =  (ImageView) findViewById(R.id.spalshwin2);

                    imSplashDot.setImageResource(R.drawable.orangebutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                    animation3.setDuration(1000);
                    //animation3.setRepeatCount(3);
                    imageAnim1.setVisibility(View.GONE);
                    imageAnim2.startAnimation(animation3);
                    imageAnim2.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 4500);


            Handler handler22 = new Handler();
            handler22.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashcorporate), 2000);
                    animation1.setOneShot(true);
                    imSplashDot.setImageResource(R.drawable.orangebutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(0.0f, -1000.0f, 0.0f, 0.0f);
                    animation3.setDuration(500);
                    //animation3.setRepeatCount(3);
                    imageAnim1.setVisibility(View.GONE);
                    imageAnim2.startAnimation(animation3);
                    imageAnim2.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 5500);

/*  -----------End of 2nd Splash Screen  --------  */



/*  -----------Start of 3rd Splash Screen  --------  */
            Handler handler31 = new Handler();
            handler31.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashpersonal), 2000);
                    animation1.setOneShot(true);

                    imSplashDot.setImageResource(R.drawable.orangebutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(1000.0f, 0.0f, 0.0f, 0.0f);
                    animation3.setDuration(500);
                    //animation3.setRepeatCount(3);
                    imageAnim1.setVisibility(View.GONE);
                    imageAnim2.setVisibility(View.GONE);
                    imageAnim3.startAnimation(animation3);
                    imageAnim3.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 6000);


            Handler handler3 = new Handler();
            handler3.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashpersonal), 2000);
                    animation1.setOneShot(true);

                    imSplashDot.setImageResource(R.drawable.greenbutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                    animation3.setDuration(1000);
                    //animation3.setRepeatCount(3);
                    imageAnim1.setVisibility(View.GONE);
                    imageAnim2.setVisibility(View.GONE);
                    imageAnim3.startAnimation(animation3);
                    imageAnim3.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 6500);

            Handler handler32 = new Handler();
            handler32.postDelayed(new Runnable() {
                public void run() {
                    AnimationDrawable animation1 = new AnimationDrawable();
                    animation1.addFrame(getResources().getDrawable(R.drawable.splashpersonal), 2000);
                    animation1.setOneShot(true);

                    imSplashDot.setImageResource(R.drawable.greenbutt);
                    imSplashDot.setVisibility(View.VISIBLE);

                    Animation animation3 = new TranslateAnimation(0.0f, -1000.0f, 0.0f, 0.0f);
                    animation3.setDuration(500);
                    //animation3.setRepeatCount(3);
                    imageAnim1.setVisibility(View.GONE);
                    imageAnim2.setVisibility(View.GONE);
                    imageAnim3.startAnimation(animation3);
                    imageAnim3.setBackgroundDrawable(animation1);
                    animation1.start();
                }
            }, 7500);


            String Path = Environment.getExternalStorageDirectory().getPath().toString() + "/" + "TrackmeGallery";
            System.out.println("Path  : " + Path);
            File FPath = new File(Path);
            if (!FPath.exists()) {
                if (!FPath.mkdir()) {
                    System.out.println("***Problem creating Image folder " + Path);
                }
            }


            mSplashThread = new Thread() {
                @Override
                public void run() {
                    try {
                        synchronized (this) {
                            wait(8000);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    finish();

                    Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
//
                }
            };
            mSplashThread.start();

        }

        else
        {
            Intent a=new Intent(SplashScreenActivity.this,LoginActivity.class);
            startActivity(a);
            finish();
        }

        // Start NewActivity.class
        //Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
        //startActivity(intent);

    }

}
