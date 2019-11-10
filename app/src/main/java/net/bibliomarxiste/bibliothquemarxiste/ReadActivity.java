package net.bibliomarxiste.bibliothquemarxiste;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
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
