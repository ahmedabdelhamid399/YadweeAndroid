package com.yadwee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class FifthScreen extends AppCompatActivity {
    //get the spinner from the xml.
    Spinner spinner1;
    //create a list of items for the spinner.
    String[] Countries = new String[]{"cairo", "alexandria", "kafrelshiekh"};
    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_screen);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Countries);
        spinner1.setAdapter(arrayAdapter);

       /* spinner1.setOnItemClickListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id
            ) {
                Toast.makeText(getApplicationContext(),"your country is : " +Countries{id},Toast.LENGTH_SHORT).Show();
            }
            public void onNothingSelected(AdapterView<?>)
            {}
        });*/
        }
}
