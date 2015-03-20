package com.familly.life;

import com.family.life.R;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Thesms extends Activity{
	
	Button sendBtn;
	
	EditText txtMessage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.the_message);
		
		sendBtn = (Button) findViewById(R.id.btnSendSMS);
		
		txtMessage = (EditText) findViewById(R.id.editTextSMS);
		
		sendBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				sendSMSMessage();
	}
});
	}

	protected void sendSMSMessage() {
		
		Log.i("Send SMS", "");
		String phoneNo = "+251911202110".toString();
		String message = txtMessage.getText().toString(); 
		try{
		 SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(phoneNo, null, message, null, null); 
		Toast.makeText(getApplicationContext(), "SMS sent.",
		Toast.LENGTH_LONG).show();
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(),
					"SMS faild, please try again.",
					Toast.LENGTH_LONG).show(); 
		            e.printStackTrace();
		}
		}
	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
}
