package com.example.descovertheplanets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Intent i=getIntent();
        String name=i.getStringExtra("name");
        TextView planetName=findViewById(R.id.planetName);
        planetName.setText(name);

        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb=findViewById(i);
                //Intent in=new Intent(Intent.ACTION_VIEW);
                if((rb.getText().toString().compareTo("Yes")==0))
                {
                    if(name.compareTo("Mars")==0)
                    {
                      String url="https://en.wikipedia.org/wiki/Mars";
                      StartUrl(url);
                    }
                    else  if(name.compareTo("Neptun")==0){
                        String url="https://ro.wikipedia.org/wiki/Neptun";
                        StartUrl(url);
                    }
                    else if(name.compareTo("Earth")==0)
                    {
                        String url="https://en.wikipedia.org/wiki/Earth";
                        StartUrl(url);
                    }
                    else if(name.compareTo("Mercury")==0)
                    {
                        String url="https://en.wikipedia.org/wiki/Mercury_(planet)";
                        StartUrl(url);
                    }
                    else if(name.compareTo("Venus")==0)
                    {
                        String url="https://en.wikipedia.org/wiki/Venus";
                        StartUrl(url);
                    }
                    else if(name.compareTo("Jupiter")==0)
                    {
                        String url="https://en.wikipedia.org/wiki/Jupiter";
                        StartUrl(url);
                    }
                    else if(name.compareTo("Saturn")==0)
                    {
                        String url="https://en.wikipedia.org/wiki/Saturn";
                        StartUrl(url);
                    }
                    else if(name.compareTo("Uranus")==0)
                    {
                        String url="https://en.wikipedia.org/wiki/Uranus";
                        StartUrl(url);
                    }

                }
            }
        });

        ImageView img=findViewById(R.id.imageView2);
        CheckBox ck=findViewById(R.id.checkBox);
        ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(name.compareTo("Mars")==0)
                {
                    img.setImageResource(R.drawable.mars2);
                }
                else  if(name.compareTo("Neptun")==0){
                    img.setImageResource(R.drawable.neptune2);
                }
                else if(name.compareTo("Earth")==0)
                {
                    img.setImageResource(R.drawable.earth2);
                }
                else if(name.compareTo("Mercury")==0)
                {
                    img.setImageResource(R.drawable.mercury2);
                }
                else if(name.compareTo("Venus")==0)
                {
                    img.setImageResource(R.drawable.venus2);
                }
                else if(name.compareTo("Jupiter")==0)
                {
                    img.setImageResource(R.drawable.jupiter2);
                }
                else if(name.compareTo("Saturn")==0)
                {
                    img.setImageResource(R.drawable.saturn2);

                }
                else if(name.compareTo("Uranus")==0)
                {
                    img.setImageResource(R.drawable.uranus2);
                }
            }
        });

    }

    public void StartUrl(String url)
    {
        Intent in=new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse(url));
            startActivity(in);

    }


}