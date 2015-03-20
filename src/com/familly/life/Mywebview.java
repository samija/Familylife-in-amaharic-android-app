package com.familly.life;

import com.family.life.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;


public class Mywebview extends Activity {

  

   @Override		
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.webview);
      WebView myWebView = (WebView) findViewById(R.id.webview);
      myWebView.loadUrl("https://www.facebook.com/TelEshtaol");

   }



   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
 @Override
	protected void onPause() {
		super.onPause();
		finish();
	}
}