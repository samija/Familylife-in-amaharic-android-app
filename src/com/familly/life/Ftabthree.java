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


public class Ftabthree extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_ftabthreetwo);
		 String fontPath = "fonts/AbyssinicaSIL-R.ttf";
	        TextView txtGhost = (TextView) findViewById(R.id.tabfthreedetails);
	       Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhost.setTypeface(tf);
	       TextView txtGhosts = (TextView) findViewById(R.id.tabfthreemiddle);
	       Typeface tfs = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhosts.setTypeface(tfs);	
	}
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  MenuInflater inflater = getMenuInflater();
		  inflater.inflate(R.menu.f_four, menu);
		 
		 return super.onCreateOptionsMenu(menu);
	 }
	 @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		 switch (item.getItemId()) {
		case R.id.farrw_four:
			startActivity(new Intent(Ftabthree.this,Ftabfour.class));
			break;

		case R.id.home:
			startActivity(new Intent(Ftabthree.this,MainActivity.class));
         break;
		case R.id.backarrow:
			startActivity(new Intent(Ftabthree.this,Ftabtwo.class));
		 break;
		case R.id.teleshtaol:
			startActivity(new Intent(Ftabthree.this,Eshtaol.class));
			break;
		case R.id.aboutus:
			startActivity(new Intent(Ftabthree.this,Aboutus.class));
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
