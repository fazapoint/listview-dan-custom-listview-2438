package com.example.latihan.listview_customlistview_2438;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
    private ListView listview;

    private String[] namaPria = new String[]{
            "Osamu Dazai", "Levi", "Tsukishima Kei", "Vinsmoke Sanji",
            "Todoroki Shouto", "Mabuchi Kou", "Shirogane Miyuki",
            "Zen Wistalia", "Masamune Makabe", "Ken Kaneki", "Fujii Natsuo",
            "Ichijou Raku", "Subaru Natsuki", "Kamado Tanjiro", "Hasibara Inosuke",
            "Haru Yosihda", "Yato Yaboku"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listview = findViewById(R.id.list_view);
        ArrayAdapter adapter = new ArrayAdapter(ListActivity.this, android.R.layout.simple_list_item_2,
                android.R.id.text1, namaPria);

        listview.setAdapter(adapter);
    }
}
