package com.example.kavi.carz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Main4Activity extends AppCompatActivity {
    Button b5,b6;
    ImageView im4;

    int cars[]={R.drawable.ambassdor,R.drawable.baleno,R.drawable.beat,R.drawable.beetle,R.drawable.benzz,R.drawable.bmww,R.drawable.bolero,R.drawable.breeza,
    R.drawable.brio,R.drawable.celerio,R.drawable.ciaz,R.drawable.city,R.drawable.compass,R.drawable.creta,R.drawable.crysta,R.drawable.crysta,
    R.drawable.duster,R.drawable.dzire,R.drawable.eco,R.drawable.eeco,R.drawable.eight,R.drawable.enjoy,R.drawable.eon,R.drawable.ertiga,
    R.drawable.esteem,R.drawable.estilo,R.drawable.etios,R.drawable.eyeten,R.drawable.fiesta,R.drawable.figo,R.drawable.fortuner,R.drawable.go,R.drawable.grande,R.drawable.hummer,R.drawable.ignis,R.drawable.indica,R.drawable.indigo,R.drawable.innova,R.drawable.itengrand,R.drawable.itwen,R.drawable.jazz,R.drawable.kten,R.drawable.kuv,R.drawable.kwid,R.drawable.micra,R.drawable.nano,R.drawable.newdezire,R.drawable.newfigo,R.drawable.padmini,R.drawable.polo,R.drawable.punto,R.drawable.qualis,R.drawable.rapid,R.drawable.safari,R.drawable.san,R.drawable.scross,R.drawable.spark,R.drawable.sumo,R.drawable.sunny,R.drawable.swift,R.drawable.tavera,R.drawable.vento,R.drawable.verna,R.drawable.waganr,R.drawable.xcent,R.drawable.xuv,R.drawable.xylo,R.drawable.zen};
    Random r;
    int pickedImage=0,lastpicked=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        im4=findViewById(R.id.imageView4);
        r=new Random();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                do {
                    pickedImage = r.nextInt(cars.length);
                } while (pickedImage == lastpicked);
                lastpicked=pickedImage;

                im4.setImageResource(cars[r.nextInt(cars.length)]);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}

