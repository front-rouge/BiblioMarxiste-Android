package net.bibliomarxiste.bibliothquemarxiste;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.read_activity);

        WebView webView = findViewById(R.id.read_webview);
        webView.loadUrl("file:///android_asset/" + this.getIntent().getStringExtra("filename"));
    }
}
