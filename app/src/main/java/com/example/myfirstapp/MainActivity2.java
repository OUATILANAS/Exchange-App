package com.example.myfirstapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    EditText nbr;
    TextView txt;
    Button btn;
    String[] users = {"Dollar","Euro","MAD"};
    TextView j_spinner_selected;
    Spinner j_spinner;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    ImageView img1;
    ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt=findViewById(R.id.textView);
        txt2=findViewById(R.id.textView2);
        txt3=findViewById(R.id.textView3);
        txt4=findViewById(R.id.textView4);
        txt5=findViewById(R.id.textView5);
        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);



        nbr=findViewById(R.id.editTextTextMultiLine);
        btn=findViewById(R.id.button);
        j_spinner=findViewById(R.id.spinner);
        j_spinner_selected=findViewById(R.id.textView2);
        txt2.setVisibility(View.INVISIBLE);
        txt3.setVisibility(View.INVISIBLE);
        txt4.setVisibility(View.INVISIBLE);
        txt5.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);




        nbr.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (nbr.getText().toString().equals("")) {
                    txt.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt.setVisibility(View.INVISIBLE);

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }


        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nbr.length()==0)
                {
                    nbr.setError("Enter a Value");
                }
                else {
                    if (j_spinner.getSelectedItem().toString() == "MAD") {
                        float a = Float.parseFloat(nbr.getText().toString()) / 10;
                        float b = Float.parseFloat(nbr.getText().toString()) / 11;

                        //txt.setText(Float.toString(a));
                        txt2.setVisibility(View.VISIBLE);
                        txt3.setVisibility(View.VISIBLE);
                        txt4.setVisibility(View.VISIBLE);
                        txt5.setVisibility(View.VISIBLE);
                        img1.setVisibility(View.VISIBLE);
                        img2.setVisibility(View.VISIBLE);
                        img1.setImageResource(R.drawable.flag_of_united_states_flat_round_512x512);
                        img2.setImageResource(R.drawable.flag_of_european_union_flat_round_512x512);
                        txt2.setText("Dollar = ");
                        txt3.setText(Float.toString(a));
                        txt4.setText("Euro = ");
                        txt5.setText(Float.toString(b));
                    } else if (j_spinner.getSelectedItem().toString() == "Euro") {
                        float a = Float.parseFloat(nbr.getText().toString()) * 11;
                        float b = (float) (Float.parseFloat(nbr.getText().toString()) / 1.05);
                        txt2.setVisibility(View.VISIBLE);
                        txt3.setVisibility(View.VISIBLE);
                        txt4.setVisibility(View.VISIBLE);
                        txt5.setVisibility(View.VISIBLE);
                        img1.setVisibility(View.VISIBLE);
                        img2.setVisibility(View.VISIBLE);
                        //txt.setText(Float.toString(a));
                        img1.setImageResource(R.drawable.flag_of_morocco_flat_round_512x512);
                        img2.setImageResource(R.drawable.flag_of_united_states_flat_round_512x512);
                        txt2.setText("MAD = ");
                        txt3.setText(Float.toString(a));
                        txt4.setText("Dollar = ");
                        txt5.setText(Float.toString(b));
                    } else if (j_spinner.getSelectedItem().toString() == "Dollar") {
                        float a = Float.parseFloat(nbr.getText().toString()) * 10;
                        float b = (float) (Float.parseFloat(nbr.getText().toString()) / 0.95);
                        txt2.setVisibility(View.VISIBLE);
                        txt3.setVisibility(View.VISIBLE);
                        txt4.setVisibility(View.VISIBLE);
                        txt5.setVisibility(View.VISIBLE);
                        img1.setVisibility(View.VISIBLE);
                        img2.setVisibility(View.VISIBLE);
                        //txt.setText(Float.toString(a));
                        img1.setImageResource(R.drawable.flag_of_morocco_flat_round_512x512);
                        img2.setImageResource(R.drawable.flag_of_european_union_flat_round_512x512);
                        txt2.setText("MAD = ");
                        txt3.setText(Float.toString(a));
                        txt4.setText("Euro = ");
                        txt5.setText(Float.toString(b));
                    }
                }

            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        j_spinner.setAdapter(adapter);
        j_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int arg2, long arg3) {

               // j_spinner_selected.setText(j_spinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);
        //nbr=findViewById();
        //txt=findViewById();
        //btn=findViewById();
    }
}