package com.familly.life;

import com.family.life.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class Eshtaol extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teleshtaol);
		
		
		
		   String fontPath = "fonts/AbyssinicaSIL-R.ttf";
	       TextView txtGhost = (TextView) findViewById(R.id.textViewteleeshtaol);
	       Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhost.setTypeface(tf);
       
	       ImageButton likebuttins = (ImageButton) findViewById(R.id.imageButtonlike);
	       likebuttins.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			startActivity(new Intent(Eshtaol.this,Mywebview.class));	
			}
		});
	       
	       
		Button buttoncall = (Button) findViewById(R.id.buttoncall);
		buttoncall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				makeCall();
				
			}

			private void makeCall() {
                 Log.i("Make call", "");
				
				Intent phoneIntent = new Intent(Intent.ACTION_CALL);
				phoneIntent.setData(Uri.parse("tel:+2510116174400"));
				
				try {
				 startActivity(phoneIntent);
				 finish();
				 Log.i("Finished making a call...", ""); } 
				catch (android.content.ActivityNotFoundException ex) { 
					
				} }
		});
		
	}
}