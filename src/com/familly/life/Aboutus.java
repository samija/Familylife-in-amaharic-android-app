package com.familly.life;

import com.family.life.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
public class Aboutus extends Activity{

   @Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_aboutus);
	 String fontPath = "fonts/AbyssinicaSIL-R.ttf";
     TextView txtGhost = (TextView) findViewById(R.id.textViewbyby);
    Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
    txtGhost.setTypeface(tf);

}

}
