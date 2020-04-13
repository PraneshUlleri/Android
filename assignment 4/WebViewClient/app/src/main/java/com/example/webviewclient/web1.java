package com.example.webviewclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class web1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);
        WebView webView = (WebView) findViewById(R.id.web);
// static html string data
        String customHtml = "<html><body><h1>Hello, Pranesh here</h1>" +
             "<p>This is a sample paragraph of static HTML In Web view</p>" +
                "</body></html>";
// load static html data on a web view
        webView.loadData(customHtml, "text/html", "UTF-8");
    }
}
