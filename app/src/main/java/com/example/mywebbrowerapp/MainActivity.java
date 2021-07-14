package com.example.mywebbrowerapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText editText;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        editText = findViewById(R.id.editText);
        searchButton = findViewById(R.id.button);

        searchButton.setOnClickListener(v -> {
            String url = editText.getText().toString();
            webView.loadUrl(url);
        });
    }
}