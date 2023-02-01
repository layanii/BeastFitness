package com.zephgv.mad.beastfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DietActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        webView = findViewById(R.id.webview1);
        webView.loadUrl("https://www.kholoudabouzid.com/tag/%D8%B3%D8%B9%D8%B1%D8%A7%D8%AA-%D8%AD%D8%B1%D8%A7%D8%B1%D9%8A%D8%A9/");

    }
}