package com.example.latihan.listview_customlistview_2438;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomListActivity extends AppCompatActivity {

    private ListView listView;

    private String[] namaWanita = new String[]{
            "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R",
            "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R",
            "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R",
            "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R", "Anisykurli Faza R",
            "Anisykurli Faza R", "Anisykurli Faza R"
    };

    private String[] asal = new String[]{
            "Lombok", "Padang", "Yogyakarta", "Bangka",
            "Bandung", "Bengkulu","Lombok", "Padang", "Yogyakarta", "Bangka",
            "Bandung", "Bengkulu","Lombok", "Padang", "Yogyakarta", "Bangka",
            "Bandung", "Bengkulu","Lombok"
    };

    private int[] nim = new int[]{
            2438,2438,2438,2438,2438,2438,
            2438,2438,2438,2438,2438,2438,
            2438,2438,2438,2438,2438
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView = findViewById(R.id.custom_listn_view);
        DataAdapter adapter = new DataAdapter(this,namaWanita,asal,nim);

        listView.setAdapter(adapter);


    }
}
