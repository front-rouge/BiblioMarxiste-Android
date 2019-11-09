package net.bibliomarxiste.bibliothquemarxiste;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.io.InputStream;
import java.util.ArrayList;
import net.bibliomarxiste.bibliothquemarxiste.adapter.EntryAdapter;
import net.bibliomarxiste.bibliothquemarxiste.utils.Entry;
import org.xmlpull.v1.XmlPullParser;



public class ListTextActivity extends AppCompatActivity {

    ArrayList<Object> entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_list_text);

        this.entries = new ArrayList<>();

        this.entries.add("Cinq Articles");
        this.entries.add(new Entry(1929, "L’élimination des conceptions erronées dans le Parti", ""));
        this.entries.add(new Entry(1937, "Contre le libéralisme", ""));
        this.entries.add(new Entry(1939, "A la mémoire de Norman Béthune", ""));
        this.entries.add(new Entry(1944, "Servir le Peuple", "servir_le_peuple.html"));
        this.entries.add(new Entry(1945, "Comment Yukong déplaça les montagnes", ""));
        this.entries.add("Quatre Essais philosophiques");
        this.entries.add(new Entry(1937, "De la contradiction", ""));
        this.entries.add(new Entry(1937, "De la pratique", ""));
        this.entries.add(new Entry(1957, "De la juste solution des contradictions au sein du peuple", ""));
        this.entries.add(new Entry(1963, "D’où viennent les idées justes ?", ""));

        /*
        String dataIndex = this.getIntent().getStringExtra("data");
        try (InputStream is = this.getAssets().open("index/" + dataIndex + ".xml")) {
            int lenght = is.available();
            byte[] buffer = new byte[lenght];
            is.read(buffer);
            Log.d("test", new String(buffer, StandardCharsets.UTF_8));
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
            Log.e("><", e.getLocalizedMessage());
        }*/
        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(new EntryAdapter(this, this.entries));

        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (entries.get(position) instanceof Entry) {
                    Entry entry = (Entry) entries.get(position);
                    Intent intent = new Intent(view.getContext(), ReadActivity.class);
                    intent.putExtra("filename", entry.getFilename());
                    view.getContext().startActivity(intent);
                }
            }
        });
    }

    private void parseIndex(InputStream in) {
        XmlPullParser xmlParser = Xml.newPullParser();
        try {
            xmlParser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            xmlParser.setInput(in, null);
            xmlParser.nextTag();
        } catch (Exception e) {
            Log.e("><", e.getLocalizedMessage());
        }
    }
}
