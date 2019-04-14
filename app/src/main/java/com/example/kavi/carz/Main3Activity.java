package com.example.kavi.carz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {
    Button b3,b4;
    ImageView im3;

    int pickedImage=0,lastpicked=0;
    int logos[]={R.drawable.bmw,R.drawable.ferrari,R.drawable.ford,R.drawable.honda,R.drawable.jaguar,R.drawable.lambor,R.drawable.mercedes,R.drawable.mini,R.drawable.mit,R.drawable.porche,R.drawable.renault,
    R.drawable.toyota,R.drawable.skoda,R.drawable.suzuki,R.drawable.tata,R.drawable.vw};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        im3=findViewById(R.id.imageView3);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();


                do {
                    pickedImage = r.nextInt(logos.length);
                } while (pickedImage == lastpicked);
                lastpicked=pickedImage;

                im3.setImageResource(logos[r.nextInt(logos.length)]);
            }
        });


    }
}
