package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Textinp f_txt;
    private Calendario f_cal;
    private Dessert f_des;
    private Button spn_btn;
    private Button cal_btn;
    private Button des_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn_btn = (Button) findViewById(R.id.button_txt);
        spn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_txt = new Textinp();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor, f_txt);
                transaction.commit();
            }
        });

        cal_btn = (Button) findViewById(R.id.button_cal);
        cal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_cal = new Calendario();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor, f_cal);
                transaction.commit();

            }
        });

        des_btn = (Button) findViewById(R.id.button_des);
        des_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_des = new Dessert();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor, f_des);
                transaction.commit();

            }
        });

    }
}