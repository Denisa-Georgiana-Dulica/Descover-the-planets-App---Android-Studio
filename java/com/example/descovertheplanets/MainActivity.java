package com.example.descovertheplanets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView=findViewById(R.id.listView);
        ArrayList<Planet> planetsList=new ArrayList<>();
        Planet planet3=new Planet("Earth","1 moon", R.drawable.pamant);
        Planet planet1=new Planet("Mercury","0 moons", R.drawable.mercur);
        Planet planet2=new Planet("Venus","0 moons", R.drawable.venus);
        Planet planet4=new Planet("Mars","2 moons", R.drawable.marte);
        Planet planet5=new Planet("Jupiter","79 moons", R.drawable.jupiter);
        Planet planet6=new Planet("Saturn","83 moons", R.drawable.saturn);
        Planet planet7=new Planet("Uranus","27 moons", R.drawable.uranus);
        Planet planet8=new Planet("Neptun","14 moons", R.drawable.neptun);

        planetsList.add(planet1);
        planetsList.add(planet2);
        planetsList.add(planet3);
        planetsList.add(planet4);
        planetsList.add(planet5);
        planetsList.add(planet6);
        planetsList.add(planet7);
        planetsList.add(planet8);

        MyCustomAdapter adapter=new MyCustomAdapter(getApplicationContext(),planetsList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("name",adapter.getItem(i).getPlanetName());
                startActivity(intent);
            }
        });
    }
}