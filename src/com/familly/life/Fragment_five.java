package com.familly.life;

import com.family.life.R;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_five extends Fragment {

	ImageView ivIcon;
	TextView tvItemName;
	ImageButton like;

	public static final String IMAGE_RESOURCE_ID = "iconResourceID";
	public static final String ITEM_NAME = "itemName";

	public Fragment_five() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View rootView = inflater.inflate(R.layout.teleshtaol, container,
				false);
		 like = (ImageButton) rootView.findViewById(R.id.imageButtonlike);
		 like.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			   startActivity(new Intent(getActivity(),Mywebview.class));	
			}
		});
		
		
		Button callbutton = (Button) rootView.findViewById(R.id.buttoncall);
		callbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				makeCall();
			}
		});
		 String fontPath = "fonts/AbyssinicaSIL-R.ttf";
		 TextView fonts = (TextView) rootView.findViewById(R.id.textViewteleeshtaol);
		 Typeface ttf = Typeface.createFromAsset(getActivity().getAssets(), fontPath);
	     fonts.setTypeface(ttf);
		 return rootView;
		
		
	}

	private void makeCall() {
		Log.i("Make call", "");
		
		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:+2510116174400"));
		
		try {
		 startActivity(phoneIntent);
		     
		 Log.i("Finished making a call...", ""); } 
		catch (android.content.ActivityNotFoundException ex) { 
			Toast.makeText(getActivity(),
					"Call faild, please try again later.", Toast.LENGTH_SHORT).show();
		} }
			
}