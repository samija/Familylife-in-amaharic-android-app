package com.familly.life;

import com.family.life.R;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentThree extends Fragment {

	ImageView ivIcon;
	TextView tvItemName;

	public static final String IMAGE_RESOURCE_ID = "iconResourceID";
	public static final String ITEM_NAME = "itemName";

	public FragmentThree() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_layout_three, container,
				false);
       ImageButton lebal = (ImageButton) view.findViewById(R.id.lebalochButton);
       lebal.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		
			startActivity(new Intent(getActivity(),Male_commandments.class));
		}
	});
       ImageButton lemist = (ImageButton) view.findViewById(R.id.lemistochButton);
       lemist.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			startActivity(new Intent(getActivity(),Female_commandments.class));
		}
	});
		
		return view;
	}

}
