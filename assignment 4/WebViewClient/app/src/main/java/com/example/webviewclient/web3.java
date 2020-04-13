package com.example.webviewclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web3 extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);

        w=findViewById(R.id.web3);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("https://www.google.co.in/");

        WebSettings ws= w.getSettings();
        ws.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (w.canGoBack()){w.goBack();}
        else
            super.onBackPressed();
    }
}
