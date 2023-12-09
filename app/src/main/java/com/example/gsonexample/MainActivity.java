package com.example.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gsonexample.ModelClass.Human;
import com.example.gsonexample.ModelClass.Place;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

        //CONVERT TO JSON
        Gson gson = new Gson();
        String jsonString = gson.toJson(human);
        text.setText(jsonString);

        //CONVERT FROM JSON
        Human human1 = gson.fromJson(jsonString, Human.class);
        human1.say();
    }
}