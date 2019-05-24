package com.example.a41639786.intentadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit1;
    private EditText edit2;
    private EditText edit3;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText) findViewById(R.id.text1);
        edit2=(EditText) findViewById(R.id.text2);
        edit3=(EditText) findViewById(R.id.text3);
        button=(Button)findViewById(R.id.button);
        escucharEvento();
    }

    protected void escucharEvento(){
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent( MainActivity.this , Main2Activity.class);
                intent.putExtra("lista",obtenerValores());
                startActivity(intent);
            }
        });

    }

    private int[] obtenerValores(){
        int[] lista = new int[];
        lista[0]=Integer.parseInt(edit1.getText().toString());
        lista[1]=Integer.parseInt(edit2.getText().toString());
        lista[2]=Integer.parseInt(edit3.getText().toString());
        return lista;
    }
}
