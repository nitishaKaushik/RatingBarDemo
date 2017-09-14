package com.example.nitishak.ratingbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    private static RatingBar rating;
    private static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingChangeListner();
    }
    public void ratingChangeListner(){
       // btn =(Button)findViewById(R.id.button);
        textView =(TextView)findViewById(R.id.textView2);
        rating = (RatingBar)findViewById(R.id.ratingBar);

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText(String.valueOf(rating));
            }
        });
    }
    public void onButton(){
        rating = (RatingBar)findViewById(R.id.ratingBar);
        btn =(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(rating.getRating()), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
