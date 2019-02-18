package com.example.mohammed.mokebrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent sentIntent = getIntent();
        Uri site = sentIntent.getData();

        if (site != null) {
            WebView webView = (WebView) findViewById(R.id.webView);
            webView.loadUrl(String.valueOf(site));
        }
    }
}
