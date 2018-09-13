package com.example.laptop.newresume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        private ListView ListView;
        private Button btnFb;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ListView =(ListView) findViewById(R.id.listViewId);
            final String [] country_names = getResources().getStringArray(R.array.skill_list);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.my_skill_layout, R.id.listTextViewId,country_names);
            ListView.setAdapter(adapter);

            ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String value = country_names[i];
                    Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                }
            });

            btnFb = findViewById(R.id.btnId);

            btnFb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent myIntent = new Intent(

                            Intent.ACTION_VIEW,
                            Uri.parse("http://www.fb.com/fazla.sykat"));
                            startActivity(myIntent);


                }
            });





        }
}
