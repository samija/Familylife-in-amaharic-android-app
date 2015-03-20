package com.familly.life;





import com.family.life.R;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentTwo   extends Fragment {

	ImageView ivIcon;
	TextView tvItemName;
    Button buttoncall;
    Button buttonsms;
    Button buttonemail;
	public static final String IMAGE_RESOURCE_ID = "iconResourceID";
	public static final String ITEM_NAME = "itemName";

	public FragmentTwo()
	{
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view=inflater.inflate(R.layout.fragment_layout_two,container, false);
		
		
		buttonemail = (Button)view.findViewById(R.id.buttonemail);
		buttonemail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(),Sendemail.class));

			}
		});
		buttonsms = (Button)view.findViewById(R.id.buttonmessage);
		buttonsms.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			  startActivity(new Intent(getActivity(),Thesms.class));	
			}
		});
		
		buttoncall = (Button)view.findViewById(R.id.buttoncall);
		buttoncall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				makeCall();
			}

			private void makeCall() {
				Log.i("Make call", "");
				
				Intent phoneIntent = new Intent(Intent.ACTION_CALL);
				phoneIntent.setData(Uri.parse("tel:+251911202110"));
				
				try {
				 startActivity(phoneIntent);
				 finish();
				 Log.i("Finished making a call...", ""); } 
				catch (android.content.ActivityNotFoundException ex) { 
					Toast.makeText(getActivity(),
							"Call faild, please try again later.", Toast.LENGTH_SHORT).show();
				} }

			private void finish() {
				// TODO Auto-generated method stub
				
			}
		});
		return view;
	}
	
}
