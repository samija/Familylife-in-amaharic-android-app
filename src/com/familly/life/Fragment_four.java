package com.familly.life;



import com.family.life.R;

import android.app.Fragment;
import android.graphics.Typeface;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_four extends Fragment {

	ImageView ivIcon;
	TextView tvItemName;

	public static final String IMAGE_RESOURCE_ID = "iconResourceID";
	public static final String ITEM_NAME = "itemName";

	public Fragment_four() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.activity_aboutus, container,
				false);
		
		String fontPath = "fonts/AbyssinicaSIL-R.ttf";
		 
		 TextView fonts = (TextView) rootView.findViewById(R.id.textViewteleeshtaol);
		 Typeface ttf = Typeface.createFromAsset(getActivity().getAssets(), fontPath);
	     fonts.setTypeface(ttf);
	     
		
		
		return rootView;
	}

}
