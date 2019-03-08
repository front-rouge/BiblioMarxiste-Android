package net.bibliomarxiste.bibliothquemarxiste;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ListTextActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_list_text);

        String dataIndex = this.getIntent().getStringExtra("data");
        try (InputStream is = this.getAssets().open("index/" + dataIndex + ".xml")) {
            int lenght = is.available();
            byte[] buffer = new byte[lenght];
            is.read(buffer);
            Log.d("test", new String(buffer, StandardCharsets.UTF_8));
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
            Log.e("><", e.getLocalizedMessage());
        }
    }

    private void parseIndex(InputStream in) {
        XmlPullParser xmlParser = Xml.newPullParser();
        try {
            xmlParser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            xmlParser.setInput(in, null);
            xmlParser.nextTag();
        } catch (Exception e) {

        } finally {

        }
    }
}
