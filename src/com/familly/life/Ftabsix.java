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


public class Ftabsix extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_ftabsixtwo);
		  String fontPath = "fonts/AbyssinicaSIL-R.ttf";
	        TextView txtGhost = (TextView) findViewById(R.id.tabfsixdetail);
	       Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhost.setTypeface(tf);
	       TextView txtGhosts = (TextView) findViewById(R.id.tabfsixmiddle);
	       Typeface tfs = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhosts.setTypeface(tfs); 
	       
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.f_seven, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	  switch (item.getItemId()) {
	case R.id.farrow_seven:
		startActivity(new Intent(Ftabsix.this,Ftabseven.class));
		break;

	case R.id.home:
		startActivity(new Intent(Ftabsix.this,MainActivity.class));
       break;
	case R.id.backarrow:
		startActivity(new Intent(Ftabsix.this,Ftabfive.class));
	 break;
	case R.id.teleshtaol:
		startActivity(new Intent(Ftabsix.this,Eshtaol.class));
		break;
	case R.id.aboutus:
		startActivity(new Intent(Ftabsix.this,Aboutus.class));
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