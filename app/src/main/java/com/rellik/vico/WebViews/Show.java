package com.rellik.vico.WebViews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.rellik.vico.R;

public class Show extends AppCompatActivity {


    WebView webView;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        new Handler().postDelayed(() -> {

            findViewById(R.id.progress).setVisibility(View.INVISIBLE);
            findViewById(R.id.webview).setVisibility(View.VISIBLE);
        }, 1500);




        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.google.com");


        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);



    }

}