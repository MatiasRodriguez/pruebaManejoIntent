package com.example.a41639786.intentadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView list;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list = findViewById(R.id.);
        bundle=savedInstanceState;
        createList();
    }
    private  void createList(){
        bundle= getIntent().getExtras(){
            int[] lista =bundle.getIntArray("lista");

            Adapter adaptador =new Adapter(this, ItemList.construirList(lista));
            list.setAdapter(adaptador);
        }
    }
}
