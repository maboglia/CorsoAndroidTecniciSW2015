package com.example.webview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MyWebView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Initialize layout
        setContentView(R.layout.activity_main);
        
        // Set mime type
        final String mimeType = "text/html";
        
        // Declare WebView variable
        WebView wv;
        
        // Get WebView from layout
        wv = (WebView) findViewById(R.id.wv1);
        
        // Get WebView settings
        WebSettings webSettings = wv.getSettings();
        
        // Enable JavaScript in settings
        webSettings.setJavaScriptEnabled(true);
        
        // Load data into WebView
        wv.loadData("<a href='http://www.bogliaccino.it/'>Mio sito web</a>",mimeType, null);
   	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
