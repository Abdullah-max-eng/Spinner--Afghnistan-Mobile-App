package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner myspineer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myspineer = findViewById(R.id.SpineerForProvinces);









        ArrayAdapter<CharSequence> arrAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.AfgProvinces, android.R.layout.simple_spinner_item );
        arrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspineer.setAdapter(arrAdapter);
        myspineer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                long ProvinceID = adapterView.getItemIdAtPosition(i);


                if (ProvinceID == 1){
                    Intent myintent = new Intent(MainActivity.this,Kabul.class);
                    startActivity(myintent);
                }
                else if (ProvinceID == 2){
                    Intent myintent = new Intent(MainActivity.this,Kandahar.class);
                    startActivity(myintent);
                }
                else if (ProvinceID == 3){
                    Intent myintent = new Intent(MainActivity.this,Herat.class);
                    startActivity(myintent);
                }
                else if (ProvinceID == 4){
                    Intent myintent = new Intent(MainActivity.this,Balkh.class);
                    startActivity(myintent);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });











    }
}