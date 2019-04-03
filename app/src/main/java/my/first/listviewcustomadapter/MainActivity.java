package my.first.listviewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleListview;
    String countryList[] = {"Bangladesh", "India", "China", "japan"};
    int flags[] = {R.drawable.bangladesh, R.drawable.india, R.drawable.china, R.drawable.japan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListview = findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleListview.setAdapter(customAdapter);
    }
}
