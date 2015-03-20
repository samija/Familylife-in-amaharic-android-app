package com.familly.life;

import java.util.ArrayList;
import java.util.List;

import com.family.life.R;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	CustomDrawerAdapter adapter;
	

	List<DrawerItem> dataList;
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.home_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initializing
		dataList = new ArrayList<DrawerItem>();
		mTitle = mDrawerTitle = getTitle();
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
        dataList.add(new DrawerItem("    የቤተሰብ ህይወት  ", R.drawable.home48));
		dataList.add(new DrawerItem("    10ቱ ትእዛዛት ", R.drawable.navtencom));
		dataList.add(new DrawerItem("     ያግኙን ", R.drawable.navcontectus));
		dataList.add(new DrawerItem(" ስለ እኛ", R.drawable.lasticon));
		dataList.add(new DrawerItem(" ቴል ኤሽታኦል ",
				R.drawable.teleeshtaol));
		

		adapter = new CustomDrawerAdapter(this, R.layout.custom_drawer_item,
				dataList);

		mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        getActionBar().setDisplayHomeAsUpEnabled(true);
		
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(mTitle);
				invalidateOptionsMenu(); // creates call to
											// onPrepareOptionsMenu()
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu(); // creates call to
											// onPrepareOptionsMenu()
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);

		if (savedInstanceState == null) {
			SelectItem(0);
		}

	}
	
	

	
	public void SelectItem(int possition) {

		Fragment fragment = null;
		Bundle args = new Bundle();
		switch (possition) {
		case 0:
			fragment = new FragmentOne();
			args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 1:
			fragment = new FragmentThree();
			args.putString(FragmentThree.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentThree.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 2:
			fragment = new FragmentTwo();
			args.putString(FragmentTwo.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentTwo.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			 break;
		
		case 3:
			fragment = new Fragment_six();
			args.putString(Fragment_six.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(Fragment_six.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 4:
			fragment = new Fragment_five();
			args.putString(Fragment_five.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(Fragment_five.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			
			break;
		case 6:
			fragment = new FragmentOne();
			args.putString(FragmentOne.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentOne.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		case 7:
			fragment = new FragmentTwo();
			args.putString(FragmentTwo.ITEM_NAME, dataList.get(possition)
					.getItemName());
			args.putInt(FragmentTwo.IMAGE_RESOURCE_ID, dataList.get(possition)
					.getImgResID());
			break;
		
		default:
			break;
		}

		fragment.setArguments(args);
		FragmentManager frgManager = getFragmentManager();
		frgManager.beginTransaction().replace(R.id.content_frame, fragment)
				.commit();

		mDrawerList.setItemChecked(possition, true);
		setTitle(dataList.get(possition).getItemName());
		mDrawerLayout.closeDrawer(mDrawerList);

	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggles
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
      switch (item.getItemId()) {
	case R.id.teleshtaol:
		startActivity(new Intent(MainActivity.this,Eshtaol.class));
		break;
	case R.id.aboutus:
		startActivity(new Intent(MainActivity.this,Aboutus.class));
	default:
		break;
	}
       return super.onOptionsItemSelected(item);
	}

	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			SelectItem(position);

		}
	}
	protected void makeCall() {
		Log.i("Make call", "");
		
		Intent phoneIntent = new Intent(Intent.ACTION_CALL);
		phoneIntent.setData(Uri.parse("tel:251912356967"));
		
		try {
		 startActivity(phoneIntent);
		 finish();
		 Log.i("Finished making a call...", ""); } 
		catch (android.content.ActivityNotFoundException ex) { 
			Toast.makeText(MainActivity.this,
					"Call faild, please try again later.", Toast.LENGTH_SHORT).show();
		} }

}
	

