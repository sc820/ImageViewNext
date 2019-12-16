package com.example.switchimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button buttonNext;
    private ImageView imageView;
    private int[] images={R.drawable.dog1, R.drawable.dog2, R.drawable.dog3};
    private int image_index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = findViewById(R.id.buttonNext);
        imageView = findViewById(R.id.imageView);

        imageView.setImageResource(images[0]);

        buttonNext.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        image_index++;
                        image_index = image_index % images.length;
                        imageView.setImageResource(images[image_index]);
                    }
                }
        );
    }
}
