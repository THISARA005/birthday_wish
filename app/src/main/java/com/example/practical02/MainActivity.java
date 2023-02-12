package com.example.practical02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static ImageView imgview;
private static Button buttonsbm;
private int current_img;
int[] images={R.drawable.cake12,R.drawable.cake1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
    public void buttonclick(){
        imgview=(ImageView) findViewById(R.id.imageView5);
        buttonsbm=(Button)findViewById(R.id.button);
        buttonsbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_img++;
                        current_img=current_img% images.length;
                        imgview.setImageResource(images[current_img]);
                    }
                }
        );
    }
}