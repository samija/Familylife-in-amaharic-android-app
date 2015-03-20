package com.familly.life;

import com.family.life.R;

import android.net.Uri; 
import android.os.Bundle;
import android.app.Activity; 
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sendemail extends Activity {
	EditText writeemail;
	Button sendbutton;
 @Override
	protected void onCreate(Bundle savedInstanceState) { 
	super.onCreate(savedInstanceState);
	setContentView(R.layout.the_email);
	
	Button startBtn = (Button) findViewById(R.id.sendEmail);
	writeemail = (EditText) findViewById(R.id.writeemail);
	startBtn.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			sendEmail();
		}
	});
}
 protected void sendEmail() {
	 Log.i("Send email", ""); 
	 String mail= "familylifegcm@gmail.com".toString();
	 String message = writeemail.getText().toString();
	 Intent emailIntent = new Intent(Intent.ACTION_SEND);
	 emailIntent.setData(Uri.parse("familylifegcm@gmail.com"));
	 emailIntent.setType("text/plain");
	 
	 
	 emailIntent.putExtra(Intent.EXTRA_EMAIL,mail);
	emailIntent.putExtra(Intent.EXTRA_TEXT, message);
	 
	 try {
		 startActivity(Intent.createChooser(emailIntent, "Send mail...")); 
	 
	 finish(); 
	 Log.i("Finished sending email...", "");
	 }catch (android.content.ActivityNotFoundException ex) { 
		 Toast.makeText(Sendemail.this, 
		"There is no email client installed.", Toast.LENGTH_SHORT).show();
	 }
	 
}
@Override 
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true; } }
