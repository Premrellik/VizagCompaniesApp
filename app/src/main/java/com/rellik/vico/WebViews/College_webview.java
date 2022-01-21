package com.rellik.vico.WebViews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.rellik.vico.R;

public class College_webview extends AppCompatActivity {

    WebView webView;


    private InterstitialAd mInterstitialAd;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_webview);


        new Handler().postDelayed(() -> {

            findViewById(R.id.progress).setVisibility(View.INVISIBLE);
            findViewById(R.id.webView_college).setVisibility(View.VISIBLE);
        }, 1500);


        webView = findViewById(R.id.webView_college);
        webView.clearCache(Boolean.parseBoolean("Uri"));

        webView.loadUrl(getIntent().getStringExtra("Uri"));


        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        webView.clearHistory();


        MobileAds.initialize(this, initializationStatus -> {
        });


        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this, "ca-app-pub-3555539480730123/5399650540", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error

                mInterstitialAd = null;
            }
        });


    }

    @Override
    public void onBackPressed() {


        if (mInterstitialAd != null) {
            mInterstitialAd.show(College_webview.this);

        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }

        super.onBackPressed();


    }


}