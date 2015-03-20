package com.familly.life;


import com.family.life.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;




public class Splash extends ActionBarActivity {
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer=new Thread(){
            public  void run(){
                try{
                    sle`ep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                  startActivity(new Intent(Splash.this,MainActivity.class));
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
  

  

   
}
