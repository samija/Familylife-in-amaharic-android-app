package com.familly.life;


import com.family.life.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


public class Ftabnine extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_ftabninetwo);
		  String fontPath = "fonts/AbyssinicaSIL-R.ttf";
	        TextView txtGhost = (TextView) findViewById(R.id.tabfninedetails);
	       Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhost.setTypeface(tf);
	       TextView txtGhosts = (TextView) findViewById(R.id.tabfninemiddle);
	       Typeface tfs = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhosts.setTypeface(tfs);
	       
	}
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  MenuInflater inflater = getMenuInflater();
		  inflater.inflate(R.menu.f_ten, menu);
		 
		 return super.onCreateOptionsMenu(menu);
	 }
	 @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	   switch (item.getItemId()) {
	case R.id.farrow_ten:
		startActivity(new Intent(Ftabnine.this,Ftabten.class));
		
		break;

	case R.id.home:
		startActivity(new Intent(Ftabnine.this,MainActivity.class));
     break;
	case R.id.backarrow:
		startActivity(new Intent(Ftabnine.this,Ftabeight.class));
	 break;
	case R.id.teleshtaol:
		startActivity(new Intent(Ftabnine.this,Eshtaol.class));
		break;
	case R.id.aboutus:
		startActivity(new Intent(Ftabnine.this,Aboutus.class));
		break;
	}
		 return super.onOptionsItemSelected(item);
	}
	 @Override
		protected void onPause() {
			super.onPause();
			finish();
		}

}