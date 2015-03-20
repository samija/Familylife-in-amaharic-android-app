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
import android.widget.Button;

public class Female_commandments extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_femalecommandments);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button5 = (Button) findViewById(R.id.button5);
		Button button7 = (Button) findViewById(R.id.button7);
		Button button8 = (Button) findViewById(R.id.button8);
		Button button9 = (Button) findViewById(R.id.button9);
		Button button10 = (Button) findViewById(R.id.button10);
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			 startActivity(new Intent(Female_commandments.this,Ftabsix.class));	
			}
		});
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			  startActivity(new Intent(Female_commandments.this,Ftabfour.class));	
			}
		});
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			 startActivity(new Intent(Female_commandments.this,Ftabtwo.class));	
			}
		});
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			 startActivity(new Intent(Female_commandments.this,Ftabone.class));	
			}
		});
		button10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			     startActivity(new Intent(Female_commandments.this,Ftabten.class));	
			}
		});
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    startActivity(new Intent(Female_commandments.this,Ftabnine.class));	
			}
		});
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			  startActivity(new Intent(Female_commandments.this,Ftabeight.class));	
			}
		});
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			  startActivity(new Intent(Female_commandments.this,Ftabseven.class));	
			}
		});
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Female_commandments.this,Ftabfive.class));
			}
		});
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				startActivity(new Intent(Female_commandments.this,Ftabthree.class));
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
		startActivity(new Intent(Female_commandments.this,MainActivity.class));
		break;
	case R.id.teleshtaol:
		startActivity(new Intent(Female_commandments.this,Eshtaol.class));
		break;
	case R.id.aboutus:
		startActivity(new Intent(Female_commandments.this,Aboutus.class));
		break;
	default:
		break;
	}
	  
	  return super.onOptionsItemSelected(item);
	
	
}

}
