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


public class Ftabten extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_ftabtentwo);
		  String fontPath = "fonts/AbyssinicaSIL-R.ttf";
	        TextView txtGhost = (TextView) findViewById(R.id.tabftendetails);
	       Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhost.setTypeface(tf);
	       TextView txtGhosts = (TextView) findViewById(R.id.tabftenmiddle);
	       Typeface tfs = Typeface.createFromAsset(getAssets(), fontPath);
	       txtGhosts.setTypeface(tfs);
	       TextView txtfooter = (TextView) findViewById(R.id.footer);
	       Typeface tfoot = Typeface.createFromAsset(getAssets(), fontPath);
	       txtfooter.setTypeface(tfoot);
		 
	       
	}
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  MenuInflater inflater = getMenuInflater();
		  inflater.inflate(R.menu.home_menu, menu);
		 
		 return super.onCreateOptionsMenu(menu);
	 }
	 @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		 switch (item.getItemId()) {
		 case R.id.home:
				startActivity(new Intent(Ftabten.this,MainActivity.class));
	           break;
		 case R.id.teleshtaol:
				startActivity(new Intent(Ftabten.this,Eshtaol.class));
				break;
			case R.id.aboutus:
				startActivity(new Intent(Ftabten.this,Aboutus.class));
				break;

		default:
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