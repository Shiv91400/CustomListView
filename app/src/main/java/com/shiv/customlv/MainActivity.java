package com.shiv.customlv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String name[]={"Shiv","Mohit","Vishal Sir","Anmol"};
    Integer img[]={R.drawable.shiv,R.drawable.car,R.drawable.lamb1,R.drawable.bikelogo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        lv=findViewById(R.id.list);
        Custom c=new  Custom(MainActivity.this,name,img);
        lv.setAdapter(c);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "This is Shiv", Toast.LENGTH_SHORT).show();
                break;
                    case 1:
                        Toast.makeText(MainActivity.this, "This is Mohit", Toast.LENGTH_SHORT).show();
                     break;
                }
            }
        });
    }
}
