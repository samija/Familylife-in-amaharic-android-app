package com.familly.life;

import com.family.life.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Tencommandments extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tencommandments);
		ImageButton lebalochbutton = (ImageButton) findViewById(R.id.lebalochButton);
		ImageButton lemistochbuttob = (ImageButton) findViewById(R.id.lemistochButton);
		lebalochbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			startActivity(new Intent(Tencommandments.this,Male_commandments.class));
			}
		});
		lemistochbuttob.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Tencommandments.this,Female_commandments.class));
			}
		});
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
		startActivity(new Intent(Tencommandments.this,MainActivity.class));
		break;
	case R.id.teleshtaol:
		startActivity(new Intent(Tencommandments.this,Eshtaol.class));
		break;
	case R.id.aboutus:
		startActivity(new Intent(Tencommandments.this,Aboutus.class));
		break;
	default:
		break;
	}
	  
	  return super.onOptionsItemSelected(item);
	
	
}

}
